package com.example.pdesire.projectdesireaudioeffects;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.os.Build;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;

/**
 * Created by PDesire on 31.01.2016.
 */
public class CreditsFragment extends PreferenceFragment {

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.pref_data_sync);
        setHasOptionsMenu(true);

        Preference reboot = (Preference) findPreference("credits_click");
        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        reboot.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            public boolean onPreferenceClick(Preference preference) {
                builder.setTitle("Credits:");
                builder.setMessage("App Teacher: Abo Hani" + "\n" + "\n" + "Inspiration: Kagamine Rin, Megpoid Gumi, Utsu-P, Megurine Luka, Hatsune Miku, Sony Corp. and Google Inc." + "\n" + "\n" + "Mentor: Honaka Rie (jimRnor)" + "\n" + "\n" + "And to:" + "\n" + "\n" + "Team Project Desire, Team Harmonics Symphonium, RXS Moonbreakers, TPD Developer Promotion Project Group and XTREMEMusic Big Family Group" + "\n" + "\n" + "Vera... That is just for you now... I hope I can meet you soon in China... :)");
                builder.create();
                builder.show();
                return false;
            }
        });
    }
}
