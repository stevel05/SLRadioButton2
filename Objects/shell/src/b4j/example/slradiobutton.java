
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class slradiobutton {
    public static RemoteObject myClass;
	public slradiobutton() {
	}
    public static PCBA staticBA = new PCBA(null, slradiobutton.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mmodule = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
public static RemoteObject _rb = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper.RadioButtonWrapper");
public static RemoteObject _rbjo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _label1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _mform = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _locate_left = RemoteObject.createImmutable("");
public static RemoteObject _locate_right = RemoteObject.createImmutable("");
public static RemoteObject _locate_top = RemoteObject.createImmutable("");
public static RemoteObject _locate_bottom = RemoteObject.createImmutable("");
public static RemoteObject _designercvcalled = RemoteObject.createImmutable(false);
public static RemoteObject _customviewname = RemoteObject.createImmutable("");
public static b4j.example.main _main = null;
public static b4j.example.slradiobutton_static _slradiobutton_static = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CustomViewName",_ref.getField(false, "_customviewname"),"DesignerCVCalled",_ref.getField(false, "_designercvcalled"),"fx",_ref.getField(false, "_fx"),"Label1",_ref.getField(false, "_label1"),"LOCATE_BOTTOM",_ref.getField(false, "_locate_bottom"),"LOCATE_LEFT",_ref.getField(false, "_locate_left"),"LOCATE_RIGHT",_ref.getField(false, "_locate_right"),"LOCATE_TOP",_ref.getField(false, "_locate_top"),"mBase",_ref.getField(false, "_mbase"),"mEventName",_ref.getField(false, "_meventname"),"mForm",_ref.getField(false, "_mform"),"mModule",_ref.getField(false, "_mmodule"),"RB",_ref.getField(false, "_rb"),"RBJO",_ref.getField(false, "_rbjo")};
}
}