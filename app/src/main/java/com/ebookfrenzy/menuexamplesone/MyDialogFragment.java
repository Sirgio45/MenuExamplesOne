package com.ebookfrenzy.menuexamplesone;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by sergio on 11/25/2016.
 */

public class MyDialogFragment extends DialogFragment
{

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        AlertDialog.Builder theDialog = new AlertDialog.Builder(getActivity());
        theDialog.setTitle("Sample Dialog");
        theDialog.setMessage("Hello I'm a dialog");
        theDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                Toast.makeText(getActivity(),"Clicked OK", Toast.LENGTH_SHORT).show();

            }
        });
        theDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                Toast.makeText(getActivity(),"Clicked Cancel", Toast.LENGTH_SHORT).show();

            }
        });
        return theDialog.create();
        //return super.onCreateDialog(savedInstanceState);
    }
}
