package com.example.androidwsclient;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import java.util.Date;

import model.ConvocatoryVO;
import model.LongList;


public class ConvocatoryActivity extends ActionBarActivity {

    private static final String SOAP_ACTION = "http://www.spopatest.unal.edu.co/CompanyMobileServicesService/hello";
    private static final String METHOD_NAME = "hello";
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
                                                        try {

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
//ok
                                                            final String nameT = "Sr. 2";
                                                            //----------------
                                                            /*
                                                            SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
                                                            request.addProperty("convocatoryVO", convocatory);
                                                            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
                                                            envelope.setOutputSoapObject(request);

                                                            HttpTransportSE ht = new HttpTransportSE(URL);
                                                            ht.call(SOAP_ACTION, envelope);
                                                            final SoapPrimitive response = (SoapPrimitive) envelope.getResponse();
                                                            final String str = (response == null) ? "nulistico " : response.toString();*/
                                                            //----------------
                                                            runOnUiThread(new Runnable() {
                                                                public void run() {
                                                                    TextView result;
                                                                    result = (TextView) findViewById(R.id.resultTxt);//Text view id is textView1
                                                                    result.setText(nameT);//+str);//(convocatory.toString());//(nameT);//
                                                                }
                                                            });
                                                        } catch (Exception e) {
                                                            e.printStackTrace();
                                                        }
                                                    }
                                                };
                                                networkThread.start();
                                            }
                                        }

        );
    }


}
