package com.meli.pdesire.projectmeliaudioeffects;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.os.Build;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.SwitchPreference;

/**
 * Created by PDesire on 31.01.2016.
 */
public class HatsuneFragment extends PreferenceFragment {

    public static int indicate = 0;
    public static int indicate_info = 0;

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.pref_hatsune);
        setHasOptionsMenu(true);

        final AlertDialog.Builder info = new AlertDialog.Builder(getActivity());
        info.setTitle("What is Project Hatsune?");
        info.setMessage("Project Hatsune is the first mod for external speaker systems, which enhance the sound to the maximum of abilities");
        if (indicate_info <= 0){
            info.create();
            info.show();
            indicate_info = 1;
        }

        final AlertDialog.Builder starter = new AlertDialog.Builder(getActivity());
        starter.setTitle("Important Information:");
        starter.setMessage("Project Hatsune is very experimental and not all features could work to 100%, I am not responsible for any crashes and bricks");
        if (indicate <= 0){
            starter.create();
            starter.show();
            indicate = 1;
        }


        //Definitions
        final Preference subwoofer = findPreference("subwoofer_switch");
        final Preference balancer = findPreference("balancer_switch");
        final Preference subwoofer_simulate = findPreference("subwoofer_simulate_switch");
        final Preference speaker = findPreference("speaker_switch");


        //Subwoofer Section
        subwoofer.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            @SuppressLint("CommitPrefEdits")
            @Override
            public boolean onPreferenceChange(Preference preference, Object newValue) {
                boolean switched = ((SwitchPreference) preference)
                        .isChecked();
                if (switched == false) {
                    try {
                        String command = "su -c sh /system/Desire/Shells/Hatsune_SubwooferEnhancer_Enable.sh";
                        Process p;
                        p = Runtime.getRuntime().exec(command);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        String command = "su -c sh /system/Desire/Shells/Hatsune_Disable.sh";
                        Process p;
                        p = Runtime.getRuntime().exec(command);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                return true;
            }
        });

        //Subwoofer_Simulator Section
        subwoofer_simulate.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            @SuppressLint("CommitPrefEdits")
            @Override
            public boolean onPreferenceChange(Preference preference, Object newValue) {
                boolean switched = ((SwitchPreference) preference)
                        .isChecked();
                if (switched == false) {
                    try {
                        String command = "su -c sh /system/Desire/Shells/Hatsune_Simulator_Enable.sh";
                        Process p;
                        p = Runtime.getRuntime().exec(command);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        String command = "su -c sh /system/Desire/Shells/Hatsune_Disable.sh";
                        Process p;
                        p = Runtime.getRuntime().exec(command);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                return true;
            }
        });

        //Balancer Section
        balancer.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            @SuppressLint("CommitPrefEdits")
            @Override
            public boolean onPreferenceChange(Preference preference, Object newValue) {
                boolean switched = ((SwitchPreference) preference)
                        .isChecked();
                if (switched == false) {
                    try {
                        String command = "su -c sh /system/Desire/Shells/Hatsune_Balancer_Enable.sh";
                        Process p;
                        p = Runtime.getRuntime().exec(command);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        String command = "su -c sh /system/Desire/Shells/Hatsune_Disable.sh";
                        Process p;
                        p = Runtime.getRuntime().exec(command);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                return true;
            }
        });

        //Speaker Section
        speaker.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            @SuppressLint("CommitPrefEdits")
            @Override
            public boolean onPreferenceChange(Preference preference, Object newValue) {
                boolean switched = ((SwitchPreference) preference)
                        .isChecked();
                if (switched == false) {
                    try {
                        String command = "su -c sh /system/Desire/Shells/Hatsune_SpeakerBooster_Enable.sh";
                        Process p;
                        p = Runtime.getRuntime().exec(command);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        String command = "su -c sh /system/Desire/Shells/Hatsune_Disable.sh";
                        Process p;
                        p = Runtime.getRuntime().exec(command);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                return true;
            }
        });
    }
}
