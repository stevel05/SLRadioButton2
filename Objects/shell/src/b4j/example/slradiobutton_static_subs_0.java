package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class slradiobutton_static_subs_0 {


public static RemoteObject  _cast(RemoteObject _rb) throws Exception{
try {
		Debug.PushSubsStack("Cast (slradiobutton_static) ","slradiobutton_static",2,slradiobutton_static.ba,slradiobutton_static.mostCurrent,5);
if (RapidSub.canDelegate("cast")) return slradiobutton_static.remoteMe.runUserSub(false, "slradiobutton_static","cast", _rb);
Debug.locals.put("RB", _rb);
 BA.debugLineNum = 5;BA.debugLine="Public Sub Cast(RB As SLRadioButton) As SLRadioBut";
Debug.ShouldStop(16);
 BA.debugLineNum = 6;BA.debugLine="Return RB";
Debug.ShouldStop(32);
if (true) return _rb;
 BA.debugLineNum = 7;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
slradiobutton_static._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}