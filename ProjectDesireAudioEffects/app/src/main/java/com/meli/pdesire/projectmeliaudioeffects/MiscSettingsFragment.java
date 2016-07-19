package com.meli.pdesire.projectmeliaudioeffects;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.SwitchPreference;

/**
 * Created by PDesire on 31.01.2016.
 */
public class MiscSettingsFragment extends PreferenceFragment {

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.pref_misc);
        setHasOptionsMenu(true);

        //DTS Section
        Preference dts = findPreference("dts_switch");

        dts.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            @SuppressLint("CommitPrefEdits")
            @Override
            public boolean onPreferenceChange(Preference preference, Object newValue) {
                boolean switched = ((SwitchPreference) preference)
                        .isChecked();
                if (switched == false) {
                    try {
                        String command = "su -c sh /system/Desire/Shells/DTS_Enable.sh";
                        Process p;
                        p = Runtime.getRuntime().exec(command);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                } else {
                    try {
                        String command = "su -c sh /system/Desire/Shells/DTS_Disable.sh";
                        Process p;
                        p = Runtime.getRuntime().exec(command);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                return true;
            }
        });

        //Desire Apps Section
        Preference dapps = findPreference("desire_player_switch");

        dapps.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            @SuppressLint("CommitPrefEdits")
            @Override
            public boolean onPreferenceChange(Preference preference, Object newValue) {
                boolean switched = ((SwitchPreference) preference)
                        .isChecked();
                if (switched == false) {
                    try {
                        String command = "su -c sh /system/Desire/Shells/Desire_Apps_Enable.sh";
                        Process p;
                        p = Runtime.getRuntime().exec(command);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                } else {
                    try {
                        String command = "su -c sh /system/Desire/Shells/Desire_Apps_Disable.sh";
                        Process p;
                        p = Runtime.getRuntime().exec(command);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                return true;
            }
        });

        //SRS Section
        //SRS Headphones Section
        Preference srshead = findPreference("srs_headphones_switch");

        srshead.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            @SuppressLint("CommitPrefEdits")
            @Override
            public boolean onPreferenceChange(Preference preference, Object newValue) {
                boolean switched = ((SwitchPreference) preference)
                        .isChecked();
                if (switched == false) {
                    try {
                        String command = "su -c sh /system/Desire/Shells/SRS/SRS_Enable_Headphones.sh";
                        Process p;
                        p = Runtime.getRuntime().exec(command);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                } else {
                    try {
                        String command = "su -c sh /system/Desire/Shells/SRS/SRS_Disable_Headphones.sh";
                        Process p;
                        p = Runtime.getRuntime().exec(command);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                return true;
            }
        });

        //SRS Bluetooth Section
        Preference srsblue = findPreference("srs_bluetooth_switch");

        srsblue.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            @SuppressLint("CommitPrefEdits")
            @Override
            public boolean onPreferenceChange(Preference preference, Object newValue) {
                boolean switched = ((SwitchPreference) preference)
                        .isChecked();
                if (switched == false) {
                    try {
                        String command = "su -c sh /system/Desire/Shells/SRS/SRS_Enable_Bluetooth.sh";
                        Process p;
                        p = Runtime.getRuntime().exec(command);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                } else {
                    try {
                        String command = "su -c sh /system/Desire/Shells/SRS/SRS_Disable_Bluetooth.sh";
                        Process p;
                        p = Runtime.getRuntime().exec(command);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                return true;
            }
        });

        //SRS Speaker Section
        Preference srsspk = findPreference("srs_speaker_switch");

        srsspk.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            @SuppressLint("CommitPrefEdits")
            @Override
            public boolean onPreferenceChange(Preference preference, Object newValue) {
                boolean switched = ((SwitchPreference) preference)
                        .isChecked();
                if (switched == false) {
                    try {
                        String command = "su -c sh /system/Desire/Shells/SRS/SRS_Enable.sh";
                        Process p;
                        p = Runtime.getRuntime().exec(command);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                } else {
                    try {
                        String command = "su -c sh /system/Desire/Shells/SRS/SRS_Disable.sh";
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
