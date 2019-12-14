package com.example.hellobandung;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class TanyaActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanya);
    }

    public void submitOrder(View view) {
        EditText namefield= (EditText) findViewById(R.id.name_field);
        String name = namefield.getText().toString();

        EditText tanyafield= (EditText) findViewById(R.id.tanya_field);
        String question = tanyafield.getText().toString();

        CheckBox yesCheckBox = (CheckBox) findViewById(R.id.yes_checkbox);
        boolean hasYes = yesCheckBox.isChecked();

        CheckBox noCheckBox = (CheckBox) findViewById(R.id.no_checkbox);
        boolean hasNo = noCheckBox.isChecked();

        int price = calculatePrice(hasYes, hasNo);

        String message = createOrderSummary(name, question, hasYes, hasNo);

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto: nurululfah10@gmail.com")); //only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT,getString(R.string.order_summary_email_subject)+" "+ name);
        intent.putExtra(Intent.EXTRA_TEXT,message);
        if (intent.resolveActivity(getPackageManager()) !=null){
            startActivity(intent);
        }

    }

    private int calculatePrice(boolean addIya, boolean addTidak ) {
        int basePrice = 5;
        if(addIya){
            basePrice=basePrice;
        }
        if (addTidak){
            basePrice=basePrice;
        }

        return basePrice;
    }

    private String createOrderSummary(String name, String question, boolean addIya, boolean addTidak) {
        String priceMessage = getString(R.string.order_summary_name, name);
        priceMessage += "\n" + getString(R.string.order_summary_question , question);
        priceMessage += "\n" + getString(R.string.perjalanan);
        priceMessage += "\n" + getString(R.string.order_summary_yes)+" "+ addIya;
        priceMessage += "\n" + getString(R.string.order_summary_no)+" "+ addTidak;
        priceMessage += "\n" + getString(R.string.thankyou);
        return priceMessage;
    }

}