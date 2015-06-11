package com.example.androidwsclient;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.MarshalDate;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import java.util.Date;
import java.util.Vector;

import model.ConvocatoryVO;
import model.CurricularProgramList;
import model.CurricularProgramVO;
import model.LongList;


public class ConsumeList extends ActionBarActivity {


    private static final String METHOD_NAME = "searchCurricularProgramWithAgreement";
    private static final String NAMESPACE = "http://facadeWS.spopa.unal.dev/";
    private static final String URL = "http://www.spopatest.unal.edu.co/CompanyMobileServicesService/CompanyMobileServicesService?wsdl";

    Button convocatoryB;//convocatoryButton


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convocatory);


        convocatoryB = (Button) findViewById(R.id.convocatoryButton);
        convocatoryB.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Thread networkThread = new Thread() {
                                                    @Override
                                                    public void run() {
                                                        buildSoapRequest();
                                                    }
                                                };
                                                networkThread.start();
                                            }

                                        }

        );
    }

    private void buildSoapRequest() {
        try {

            final ConvocatoryVO convocatory = fillconvocatoryVO();
//ok
            //----------------
            ///*
            SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
            request.addProperty("idCompany", 18894);
            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            new MarshalDate().register(envelope);//serializacion Fechas...
            envelope.setOutputSoapObject(request);//
            envelope.implicitTypes=false;//fin seria. fechas
            HttpTransportSE ht = new HttpTransportSE(URL,6000);
            ht.debug=true;
            //HttpTransportSE ht = new HttpTransportSE(URL);
            //ht.call(SOAP_ACTION, envelope);
            ht.call(NAMESPACE + METHOD_NAME,envelope);

            Log.i("REQUEST--->", ht.requestDump);
            Log.i("RESPONSE--->", ht.responseDump);
//-----------------------------------
            //SoapObject response = (SoapObject)envelope.getResponse();
            //CurricularProgramList response = (CurricularProgramList)envelope.getResponse();
            SoapObject response = (SoapObject)envelope.bodyIn;
            //Object obj = response.getPrimitivePropertyAsString("return");
            String str1="str vacio";
            int responseSize;
            CurricularProgramList curricularPrograms = new CurricularProgramList();
            CurricularProgramVO cpVO;
            if(response!=null &&response.getPropertyCount()>0){
                //str1=response.getProperty(0).toString();
                str1 = "";
                responseSize = response.getPropertyCount();
                for (int i = 0; i < responseSize; i++) {
                    SoapObject so =  (SoapObject) response.getProperty(i);
                    cpVO = new CurricularProgramVO(so);
                    curricularPrograms.add(cpVO);
                    str1 += cpVO.getNameCurricularProgramVO() + "\n";
                }
            }else{
                str1="paila perrros";
            }
            final String str=str1;
//------------------------------------
            runOnUiThread(new Runnable() {
                public void run() {
                    TextView result;
                    result = (TextView) findViewById(R.id.resultTxt);//Text view id is textView1
                    result.setText(str);//(convocatory.toString());//
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private ConvocatoryVO fillconvocatoryVO() {
        final ConvocatoryVO convocatory = new ConvocatoryVO();
        convocatory.setIdConvoVO((long) 122200);
        convocatory.setTitleConvoVO("Prueba Convenios");
        convocatory.setDescriptionConvoVO("prueba");
        //convocatory.setRequirementConvoVO(null);
        convocatory.setSalaryConvoVO(1);
        convocatory.setSectorConvoVO("Prueba");
        // convocatory.setSubSectorConvoVO(null);
        convocatory.setPositionConvoVO("Prueba");
        convocatory.setVacanciesConvoVO(1);
        convocatory.setScheduleTypeConvoVO(String.valueOf(1));
        convocatory.setIsConfidentialConvoVO(false);
        convocatory.setFlexibleScheduleConvoVO(false);
        convocatory.setInnerConvoVO(false);
        //convocatory.setOtherBenefitsConvoVO(null);
        convocatory.setClosingDateConvoVO(new Date("03/04/23"));
        convocatory.setStartDateConvoVO(new Date("22/04/23"));
        convocatory.setPublicationDateConvoVO(new Date("06/04/15"));
        //convocatory.setIdCityConvoVO(null);
        convocatory.setIdCompanyVO((long) 57281);
        convocatory.setPhaseConvoVO(0);
        convocatory.setIdApplicationStatusVOs(new LongList());
        convocatory.setIdConcreteModalityVOs(new LongList());
        convocatory.setIdConvocatorysPublicationVOs(new LongList());
        convocatory.setRequiredProfileVO("prueba");
        //convocatory.setTypeContractVO(null);
        //convocatory.setOriginalClosingDate(null);
        return convocatory;
    }
}
