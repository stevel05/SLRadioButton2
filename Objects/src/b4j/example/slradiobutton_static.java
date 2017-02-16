package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class slradiobutton_static extends Object{
public static slradiobutton_static mostCurrent = new slradiobutton_static();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.ShellBA("b4j.example", "b4j.example.slradiobutton_static", null);
		ba.loadHtSubs(slradiobutton_static.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.slradiobutton_static", ba);
		}
	}
    public static Class<?> getObject() {
		return slradiobutton_static.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static b4j.example.main _main = null;
public static b4j.example.slradiobutton  _cast(b4j.example.slradiobutton _rb) throws Exception{
RDebugUtils.currentModule="slradiobutton_static";
if (Debug.shouldDelegate(ba, "cast"))
	return (b4j.example.slradiobutton) Debug.delegate(ba, "cast", new Object[] {_rb});
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Public Sub Cast(RB As SLRadioButton) As SLRadioBut";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Return RB";
if (true) return _rb;
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="End Sub";
return null;
}
}