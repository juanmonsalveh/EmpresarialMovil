package com.example.androidwsclient;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;
import android.os.Bundle;

public class AndroidWSClientActivity extends Activity {

    private static final String SOAP_ACTION = "http://www.spopatest.unal.edu.co/CompanyMobileServicesService/hello";
    private static final String METHOD_NAME = "hello";
    private static final String NAMESPACE = "http://facadeWS.spopa.unal.dev/";
    private static final String URL = "http://www.spopatest.unal.edu.co/CompanyMobileServicesService/CompanyMobileServicesService?wsdl";

    Button hola;//holaButton
    EditText name;//nameTxt

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_wsclient);


        hola = (Button) findViewById(R.id.holaButton);
        name = (EditText) findViewById(R.id.nameTxt);
        hola.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Thread networkThread = new Thread() {
                                            @Override
                                            public void run() {
                                                try {

                                                    String nameT = "Hi Sr. " + name.getText();

                                                    SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
                                                    request.addProperty("name", nameT);
                                                    SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
                                                    envelope.setOutputSoapObject(request);

                                                    HttpTransportSE ht = new HttpTransportSE(URL);
                                                    //ht.call(SOAP_ACTION, envelope);
                                                    ht.call(NAMESPACE + METHOD_NAME,envelope);
                                                    final SoapPrimitive response = (SoapPrimitive) envelope.getResponse();
                                                    final String str = response.toString();

                                                    runOnUiThread(new Runnable() {
                                                        public void run() {
                                                            TextView result;
                                                            result = (TextView) findViewById(R.id.textView1);//Text view id is textView1
                                                            result.setText(str);
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
