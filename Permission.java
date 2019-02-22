import android.view.*;
import android.support.v4.content.*;
import android.*;
import android.app.*;
import android.content.pm.*;
import android.support.v4.app.*;
import android.util.*;

public class Permission
{
	//PROTECTION_NORMAL
	public int REQUEST_ACCESS_LOCATION_EXTRA_COMMANDS=0;
	private int REQUEST_ACCESS_NETWORK_STATE=1;
	private int REQUEST_ACCESS_NOTIFICATION_POLICY=2;
	private int REQUEST_ACCESS_WIFI_STATE=3;
	private int REQUEST_BLUETOOTH=4;
	private int REQUEST_BLUETOOTH_ADMIN=5;
	private int REQUEST_BROADCAST_STICKY=6;
	private int REQUEST_CHANGE_NETWORK_STATE=7;
	private int REQUEST_CHANGE_WIFI_MULTICAST_STATE=8;
	private int REQUEST_CHANGE_WIFI_STATE=9;
	private int REQUEST_DISABLE_KEYGUARD=10;
	private int REQUEST_EXPAND_STATUS_BAR=11;
	private int REQUEST_GET_PACKAGE_SIZE=12;
	private int REQUEST_INSTALL_SHORTCUT=13;
	private int REQUEST_INTERNET=14;
	private int REQUEST_KILL_BACKGROUND_PROCESSES=15;
	private int REQUEST_MODIFY_AUDIO_SETTINGS=16;
	private int REQUEST_NFC=17;
	private int REQUEST_READ_SYNC_SETTINGS=18;
	private int REQUEST_READ_SYNC_STATS=19;
	private int REQUEST_RECEIVE_BOOT_COMPLETED=20;
	private int REQUEST_REORDER_TASKS=21;
	private int REQUEST_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS=22;
	private int REQUEST_REQUEST_INSTALL_PACKAGES=23;
	private int REQUEST_SET_ALARM=24;
	private int REQUEST_SET_TIME_ZONE=25;
	private int REQUEST_SET_WALLPAPER=26;
	private int REQUEST_SET_WALLPAPER_HINTS=27;
	private int REQUEST_TRANSMIT_IR=28;
	private int REQUEST_UNINSTALL_SHORTCUT=29;
	private int REQUEST_USE_FINGERPRINT=30;
	private int REQUEST_VIBRATE=31;
	private int REQUEST_WAKE_LOCK=32;
	private int REQUEST_WRITE_SYNC_SETTINGS=33;
	
	//Dangerous permissions
	private int REQUEST_READ_CALENDAR=34;
	private int REQUEST_WRITE_CALENDAR=35;
	private int REQUEST_CAMERA=36;
	private int REQUEST_READ_CONTACTS=37;
	private int REQUEST_WRITE_CONTACTS=38;
	private int REQUEST_GET_ACCOUNTS=39;
	private int REQUEST_ACCESS_FINE_LOCATION=40;
	private int REQUEST_ACCESS_COARSE_LOCATION=41;
	private int REQUEST_RECORD_AUDIO=42;
	private int REQUEST_READ_PHONE_STATE=43;
	private int REQUEST_READ_PHONE_NUMBERS=44;
	private int REQUEST_CALL_PHONE=45;
	private int REQUEST_ANSWER_PHONE_CALLS=46;
	private int REQUEST_READ_CALL_LOG=47;
	private int REQUEST_WRITE_CALL_LOG=48;
	private int REQUEST_ADD_VOICEMAIL=49;
	private int REQUEST_USE_SIP=50;
	private int REQUEST_PROCESS_OUTGOING_CALLS=51;
	private int REQUEST_BODY_SENSORS=52;
	private int REQUEST_SEND_SMS=53;
	private int REQUEST_RECEIVE_SMS=54;
	private int REQUEST_READ_SMS=55;
	private int REQUEST_RECEIVE_WAP_PUSH=56;
	private int REQUEST_RECEIVE_MMS=57;
	private int REQUEST_READ_EXTERNAL_STORAGE=58;
	private int REQUEST_WRITE_EXTERNAL_STORAGE=59;
	
	public Permission(){
	}
	
	public void Add(Activity activity,String PermissionString){
		switch(PermissionString){
			case "ACCESS_LOCATION_EXTRA_COMMANDS":
				
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.ACCESS_LOCATION_EXTRA_COMMANDS)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.ACCESS_LOCATION_EXTRA_COMMANDS)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.ACCESS_LOCATION_EXTRA_COMMANDS},
														  REQUEST_ACCESS_LOCATION_EXTRA_COMMANDS);
					}
				}
				break;
			case "ACCESS_NETWORK_STATE":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.ACCESS_NETWORK_STATE)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.ACCESS_NETWORK_STATE)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.ACCESS_NETWORK_STATE},
														  REQUEST_ACCESS_NETWORK_STATE);
					}
				}
				break;
			case "ACCESS_NOTIFICATION_POLICY":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.ACCESS_NOTIFICATION_POLICY)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.ACCESS_NOTIFICATION_POLICY)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.ACCESS_NOTIFICATION_POLICY},
														  REQUEST_ACCESS_NOTIFICATION_POLICY);
					}
				}
				break;
			case "ACCESS_WIFI_STATE":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.ACCESS_WIFI_STATE)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.ACCESS_WIFI_STATE)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.ACCESS_WIFI_STATE},
														  REQUEST_ACCESS_WIFI_STATE);
					}
				}
				break;
			case "BLUETOOTH":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.BLUETOOTH)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.BLUETOOTH)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.BLUETOOTH},
														  REQUEST_BLUETOOTH);
					}
				}
				break;
			case "BLUETOOTH_ADMIN":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.BLUETOOTH_ADMIN)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.BLUETOOTH_ADMIN)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.BLUETOOTH_ADMIN},
														  REQUEST_BLUETOOTH_ADMIN);
					}
				}
				break;
			case "BROADCAST_STICKY":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.BROADCAST_STICKY)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.BROADCAST_STICKY)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.BROADCAST_STICKY},
														  REQUEST_BROADCAST_STICKY);
					}
				}
				break;
			case "CHANGE_NETWORK_STATE":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.CHANGE_NETWORK_STATE)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.CHANGE_NETWORK_STATE)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.CHANGE_NETWORK_STATE},
														  REQUEST_CHANGE_NETWORK_STATE);
					}
				}
				break;
			case "CHANGE_WIFI_MULTICAST_STATE":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.CHANGE_WIFI_MULTICAST_STATE)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.CHANGE_WIFI_MULTICAST_STATE)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.CHANGE_WIFI_MULTICAST_STATE},
														  REQUEST_CHANGE_WIFI_MULTICAST_STATE);
					}
				}
				break;
			case "CHANGE_WIFI_STATE":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.CHANGE_WIFI_STATE)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.CHANGE_WIFI_STATE)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.CHANGE_WIFI_STATE},
														  REQUEST_CHANGE_WIFI_STATE);
					}
				}
				break;
			case "DISABLE_KEYGUARD":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.DISABLE_KEYGUARD)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.DISABLE_KEYGUARD)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.DISABLE_KEYGUARD},
														  REQUEST_DISABLE_KEYGUARD);
					}
				}
				break;
			case "EXPAND_STATUS_BAR":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.EXPAND_STATUS_BAR)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.EXPAND_STATUS_BAR)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.EXPAND_STATUS_BAR},
														  REQUEST_EXPAND_STATUS_BAR);
					}
				}
				break;
			case "GET_PACKAGE_SIZE":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.GET_PACKAGE_SIZE)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.GET_PACKAGE_SIZE)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.GET_PACKAGE_SIZE},
														  REQUEST_GET_PACKAGE_SIZE);
					}
				}
				break;
			case "INSTALL_SHORTCUT":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.INSTALL_SHORTCUT)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.INSTALL_SHORTCUT)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.INSTALL_SHORTCUT},
														  REQUEST_INSTALL_SHORTCUT);
					}
				}
				break;
			case "INTERNET":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.INTERNET)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.INTERNET)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.INTERNET},
														  REQUEST_INTERNET);
					}
				}
				break;
			case "KILL_BACKGROUND_PROCESSES":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.KILL_BACKGROUND_PROCESSES)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.KILL_BACKGROUND_PROCESSES)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.KILL_BACKGROUND_PROCESSES},
														  REQUEST_KILL_BACKGROUND_PROCESSES);
					}
				}
				break;
			case "MODIFY_AUDIO_SETTINGS":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.MODIFY_AUDIO_SETTINGS)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.MODIFY_AUDIO_SETTINGS)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.MODIFY_AUDIO_SETTINGS},
														  REQUEST_MODIFY_AUDIO_SETTINGS);
					}
				}
				break;
			case "NFC":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.NFC)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.NFC)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.NFC},
														  REQUEST_NFC);
					}
				}
				break;
			case "READ_SYNC_SETTINGS":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.READ_SYNC_SETTINGS)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.READ_SYNC_SETTINGS)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.READ_SYNC_SETTINGS},
														  REQUEST_READ_SYNC_SETTINGS);
					}
				}
				break;
			case "READ_SYNC_STATS":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.READ_SYNC_STATS)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.READ_SYNC_STATS)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.READ_SYNC_STATS},
														  REQUEST_READ_SYNC_STATS);
					}
				}
				break;
			case "RECEIVE_BOOT_COMPLETED":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.RECEIVE_BOOT_COMPLETED)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.RECEIVE_BOOT_COMPLETED)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.RECEIVE_BOOT_COMPLETED},
														  REQUEST_RECEIVE_BOOT_COMPLETED);
					}
				}
				break;
			case "REORDER_TASKS":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.REORDER_TASKS)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.REORDER_TASKS)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.REORDER_TASKS},
														  REQUEST_REORDER_TASKS);
					}
				}
				break;
			case "REQUEST_IGNORE_BATTERY_OPTIMIZATIONS":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS},
														  REQUEST_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS);
					}
				}
				break;
			case "REQUEST_INSTALL_PACKAGES":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.REQUEST_INSTALL_PACKAGES)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.REQUEST_INSTALL_PACKAGES)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.REQUEST_INSTALL_PACKAGES},
														  REQUEST_REQUEST_INSTALL_PACKAGES);
					}
				}
				break;
			case "SET_ALARM":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.SET_ALARM)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.SET_ALARM)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.SET_ALARM},
														  REQUEST_SET_ALARM);
					}
				}
				break;
			case "SET_TIME_ZONE":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.SET_TIME_ZONE)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.SET_TIME_ZONE)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.SET_TIME_ZONE},
														  REQUEST_SET_TIME_ZONE);
					}
				}
				break;
			case "SET_WALLPAPER":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.SET_WALLPAPER)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.SET_WALLPAPER)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.SET_WALLPAPER},
														  REQUEST_SET_WALLPAPER);
					}
				}
				break;
			case "SET_WALLPAPER_HINTS":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.SET_WALLPAPER_HINTS)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.SET_WALLPAPER_HINTS)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.SET_WALLPAPER_HINTS},
														  REQUEST_SET_WALLPAPER_HINTS);
					}
				}
				break;
			case "TRANSMIT_IR":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.TRANSMIT_IR)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.TRANSMIT_IR)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.TRANSMIT_IR},
														  REQUEST_TRANSMIT_IR);
					}
				}
				break;
			case "UNINSTALL_SHORTCUT":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.UNINSTALL_SHORTCUT)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.UNINSTALL_SHORTCUT)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.UNINSTALL_SHORTCUT},
														  REQUEST_UNINSTALL_SHORTCUT);
					}
				}
				break;
			case "USE_FINGERPRINT":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.USE_FINGERPRINT)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.USE_FINGERPRINT)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.USE_FINGERPRINT},
														  REQUEST_USE_FINGERPRINT);
					}
				}
				break;
			case "VIBRATE":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.VIBRATE)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.VIBRATE)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.VIBRATE},
														  REQUEST_VIBRATE);
					}
				}
				break;
			case "WAKE_LOCK":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.WAKE_LOCK)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.WAKE_LOCK)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.WAKE_LOCK},
														  REQUEST_WAKE_LOCK);
					}
				}
				break;
			case "WRITE_SYNC_SETTINGS":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.WRITE_SYNC_SETTINGS)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.WRITE_SYNC_SETTINGS)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.WRITE_SYNC_SETTINGS},
														  REQUEST_WRITE_SYNC_SETTINGS);
					}
				}
				break;
			case "READ_CALENDAR":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.READ_CALENDAR)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.READ_CALENDAR)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.READ_CALENDAR},
														  REQUEST_READ_CALENDAR);
					}
				}
				break;
			case "WRITE_CALENDAR":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.WRITE_CALENDAR)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.WRITE_CALENDAR)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.WRITE_CALENDAR},
														  REQUEST_WRITE_CALENDAR);
					}
				}
				break;
			case "CAMERA":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.CAMERA)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.CAMERA)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.CAMERA},
														  REQUEST_CAMERA);
					}
				}
				break;
			case "READ_CONTACTS":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.READ_CONTACTS)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.READ_CONTACTS)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.READ_CONTACTS},
														  REQUEST_READ_CONTACTS);
					}
				}
				break;
			case "WRITE_CONTACTS":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.WRITE_CONTACTS)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.WRITE_CONTACTS)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.WRITE_CONTACTS},
														  REQUEST_WRITE_CONTACTS);
					}
				}
				break;
			case "GET_ACCOUNTS":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.GET_ACCOUNTS)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.GET_ACCOUNTS)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.GET_ACCOUNTS},
														  REQUEST_GET_ACCOUNTS);
					}
				}
				break;
			case "ACCESS_FINE_LOCATION":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.ACCESS_FINE_LOCATION)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.ACCESS_FINE_LOCATION)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
														  REQUEST_ACCESS_FINE_LOCATION);
					}
				}
				break;
			case "ACCESS_COARSE_LOCATION":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.ACCESS_COARSE_LOCATION)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.ACCESS_COARSE_LOCATION)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.ACCESS_COARSE_LOCATION},
														  REQUEST_ACCESS_COARSE_LOCATION);
					}
				}
				break;
			case "RECORD_AUDIO":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.RECORD_AUDIO)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.RECORD_AUDIO)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.RECORD_AUDIO},
														  REQUEST_RECORD_AUDIO);
					}
				}
				break;
			case "READ_PHONE_STATE":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.READ_PHONE_STATE)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.READ_PHONE_STATE)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.READ_PHONE_STATE},
														  REQUEST_READ_PHONE_STATE);
					}
				}
				break;
			case "READ_PHONE_NUMBERS":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.READ_PHONE_NUMBERS)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.READ_PHONE_NUMBERS)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.READ_PHONE_NUMBERS},
														  REQUEST_READ_PHONE_NUMBERS);
					}
				}
				break;
			case "CALL_PHONE":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.CALL_PHONE)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.CALL_PHONE)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.CALL_PHONE},
														  REQUEST_CALL_PHONE);
					}
				}
				break;
			case "ANSWER_PHONE_CALLS":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.ANSWER_PHONE_CALLS)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.ANSWER_PHONE_CALLS)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.ANSWER_PHONE_CALLS},
														  REQUEST_ANSWER_PHONE_CALLS);
					}
				}
				break;
			case "READ_CALL_LOG":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.READ_CALL_LOG)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.READ_CALL_LOG)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.READ_CALL_LOG},
														  REQUEST_READ_CALL_LOG);
					}
				}
				break;
			case "WRITE_CALL_LOG":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.WRITE_CALL_LOG)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.WRITE_CALL_LOG)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.WRITE_CALL_LOG},
														  REQUEST_WRITE_CALL_LOG);
					}
				}
				break;
			case "ADD_VOICEMAIL":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.ADD_VOICEMAIL)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.ADD_VOICEMAIL)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.ADD_VOICEMAIL},
														  REQUEST_ADD_VOICEMAIL);
					}
				}
				break;
			case "USE_SIP":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.USE_SIP)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.USE_SIP)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.USE_SIP},
														  REQUEST_USE_SIP);
					}
				}
				break;
			case "PROCESS_OUTGOING_CALLS":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.PROCESS_OUTGOING_CALLS)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.PROCESS_OUTGOING_CALLS)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.PROCESS_OUTGOING_CALLS},
														  REQUEST_PROCESS_OUTGOING_CALLS);
					}
				}
				break;
			case "BODY_SENSORS":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.BODY_SENSORS)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.BODY_SENSORS)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.BODY_SENSORS},
														  REQUEST_BODY_SENSORS);
					}
				}
				break;
			case "SEND_SMS":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.SEND_SMS)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.SEND_SMS)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.SEND_SMS},
														  REQUEST_SEND_SMS);
					}
				}
				break;
			case "RECEIVE_SMS":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.RECEIVE_SMS)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.RECEIVE_SMS)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.RECEIVE_SMS},
														  REQUEST_RECEIVE_SMS);
					}
				}
				break;
			case "READ_SMS":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.READ_SMS)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.READ_SMS)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.READ_SMS},
														  REQUEST_READ_SMS);
					}
				}
				break;
			case "RECEIVE_WAP_PUSH":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.RECEIVE_WAP_PUSH)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.RECEIVE_WAP_PUSH)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.RECEIVE_WAP_PUSH},
														  REQUEST_RECEIVE_WAP_PUSH);
					}
				}
				break;
			case "RECEIVE_MMS":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.RECEIVE_MMS)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.RECEIVE_MMS)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.RECEIVE_MMS},
														  REQUEST_RECEIVE_MMS);
					}
				}
				break;
			case "READ_EXTERNAL_STORAGE":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.READ_EXTERNAL_STORAGE)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.READ_EXTERNAL_STORAGE)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
														  REQUEST_READ_EXTERNAL_STORAGE);
					}
				}
				break;
			case "WRITE_EXTERNAL_STORAGE":
				if (ContextCompat .checkSelfPermission(activity,
													   Manifest.permission.WRITE_EXTERNAL_STORAGE)
					!= PackageManager.PERMISSION_GRANTED) {

					if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
																			Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
					} else {
						ActivityCompat.requestPermissions(activity,
														  new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
														  REQUEST_WRITE_EXTERNAL_STORAGE);
					}
				}
				break;
		}
	}
}
