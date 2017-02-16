
package b4j.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new main();
		remoteMe = RemoteObject.declareNull("b4j.example.main");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "b4j.example.main");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, main.class);
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
    public static RemoteObject getObject() {
		return myClass;
	 }
	public PCBA create(Object[] args) throws ClassNotFoundException{
		ba = (RemoteObject) args[1];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _mainform = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _radiobutton1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper.RadioButtonWrapper");
public static RemoteObject _rb = RemoteObject.declareNull("b4j.example.slradiobutton");
public static RemoteObject _slradiobutton1 = RemoteObject.declareNull("b4j.example.slradiobutton");
public static RemoteObject _rb1 = RemoteObject.declareNull("b4j.example.slradiobutton");
public static RemoteObject _rb2 = RemoteObject.declareNull("b4j.example.slradiobutton");
public static RemoteObject _rb3 = RemoteObject.declareNull("b4j.example.slradiobutton");
public static b4j.example.slradiobutton_static _slradiobutton_static = null;
  public Object[] GetGlobals() {
		return new Object[] {"fx",main._fx,"MainForm",main._mainform,"RadioButton1",main._radiobutton1,"RB",main._rb,"RB1",main._rb1,"RB2",main._rb2,"RB3",main._rb3,"SLRadioButton_Static",Debug.moduleToString(b4j.example.slradiobutton_static.class),"SLRadioButton1",main._slradiobutton1};
}
}