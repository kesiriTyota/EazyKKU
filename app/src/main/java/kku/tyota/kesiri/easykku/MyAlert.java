package kku.tyota.kesiri.easykku;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by MetasitZ on 12-Nov-16.
 */

public class MyAlert {
    private Context context;
    private int anInt;
    private String titleString, messageString;


    public MyAlert(Context context,int anInt,String titleString,String messageString){
        this.context = context;
        this.anInt = anInt;
        this.titleString = titleString;
        this.messageString=messageString;
    }

    public void myDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(anInt);
        builder.setTitle(titleString);
        builder.setMessage(messageString);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.show();
    }

}
