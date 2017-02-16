package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _appstart(RemoteObject _form1,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,22);
if (RapidSub.canDelegate("appstart")) return main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);
RemoteObject _tg = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 22;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="MainForm = Form1";
Debug.ShouldStop(4194304);
main._mainform = _form1;
 BA.debugLineNum = 24;BA.debugLine="MainForm.RootPane.LoadLayout(\"1\") 'Load the layou";
Debug.ShouldStop(8388608);
main._mainform.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",main.ba,(Object)(RemoteObject.createImmutable("1")));
 BA.debugLineNum = 25;BA.debugLine="MainForm.Show";
Debug.ShouldStop(16777216);
main._mainform.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 27;BA.debugLine="RB1.GroupRadioButtons(Array As SLRadioButton(RB1,";
Debug.ShouldStop(67108864);
main._rb1.runClassMethod (b4j.example.slradiobutton.class, "_groupradiobuttons",(Object)((RemoteObject.createNewArray("b4j.example.slradiobutton",new int[] {3},new Object[] {main._rb1,main._rb2,main._rb3}))));
 BA.debugLineNum = 30;BA.debugLine="RB.Initialize(Me,\"RB\")";
Debug.ShouldStop(536870912);
main._rb.runClassMethod (b4j.example.slradiobutton.class, "_initialize",main.ba,(Object)(main.getObject()),(Object)(RemoteObject.createImmutable("RB")));
 BA.debugLineNum = 31;BA.debugLine="RB.Setup(\"From Code\",RB.LOCATE_RIGHT,False,False,";
Debug.ShouldStop(1073741824);
main._rb.runClassMethod (b4j.example.slradiobutton.class, "_setup",(Object)(BA.ObjectToString("From Code")),(Object)(main._rb.getField(true,"_locate_right")),(Object)(main.__c.getField(true,"False")),(Object)(main.__c.getField(true,"False")),(Object)(main._mainform),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), main.__c.getField(false,"Null")),(Object)(BA.numberCast(int.class, 30)),(Object)(BA.numberCast(int.class, 130)),(Object)(BA.numberCast(int.class, 170)),(Object)(BA.numberCast(int.class, 30)));
 BA.debugLineNum = 36;BA.debugLine="Dim TG As JavaObject = SLRadioButton1.AddToToggle";
Debug.ShouldStop(8);
_tg = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_tg = main._slradiobutton1.runClassMethod (b4j.example.slradiobutton.class, "_addtotogglegroup",(Object)((main._slradiobutton1.runClassMethod (b4j.example.slradiobutton.class, "_gettogglegroup2",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), main._radiobutton1.getObject())).getObject())));Debug.locals.put("TG", _tg);Debug.locals.put("TG", _tg);
 BA.debugLineNum = 37;BA.debugLine="RB.AddToToggleGroup(TG)";
Debug.ShouldStop(16);
main._rb.runClassMethod (b4j.example.slradiobutton.class, "_addtotogglegroup",(Object)((_tg.getObject())));
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
slradiobutton_static_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.example.main");
slradiobutton.myClass = BA.getDeviceClass ("b4j.example.slradiobutton");
slradiobutton_static.myClass = BA.getDeviceClass ("b4j.example.slradiobutton_static");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 11;BA.debugLine="Private MainForm As Form";
main._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 13;BA.debugLine="Private RadioButton1 As RadioButton						'Std Rad";
main._radiobutton1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper.RadioButtonWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private RB As SLRadioButton									'Added in cod";
main._rb = RemoteObject.createNew ("b4j.example.slradiobutton");
 //BA.debugLineNum = 15;BA.debugLine="Private SLRadioButton1 As SLRadioButton					'Adde";
main._slradiobutton1 = RemoteObject.createNew ("b4j.example.slradiobutton");
 //BA.debugLineNum = 17;BA.debugLine="Private RB1 As SLRadioButton";
main._rb1 = RemoteObject.createNew ("b4j.example.slradiobutton");
 //BA.debugLineNum = 18;BA.debugLine="Private RB2 As SLRadioButton";
main._rb2 = RemoteObject.createNew ("b4j.example.slradiobutton");
 //BA.debugLineNum = 19;BA.debugLine="Private RB3 As SLRadioButton";
main._rb3 = RemoteObject.createNew ("b4j.example.slradiobutton");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _radiobutton1_selectedchange(RemoteObject _selected) throws Exception{
try {
		Debug.PushSubsStack("RadioButton1_SelectedChange (main) ","main",0,main.ba,main.mostCurrent,52);
if (RapidSub.canDelegate("radiobutton1_selectedchange")) return main.remoteMe.runUserSub(false, "main","radiobutton1_selectedchange", _selected);
Debug.locals.put("Selected", _selected);
 BA.debugLineNum = 52;BA.debugLine="Sub RadioButton1_SelectedChange(Selected As Boolea";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="Log(\"Standard Radiobutton in Designer Changed \" &";
Debug.ShouldStop(1048576);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Standard Radiobutton in Designer Changed "),_selected)));
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rb_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("RB_MouseClicked (main) ","main",0,main.ba,main.mostCurrent,40);
if (RapidSub.canDelegate("rb_mouseclicked")) return main.remoteMe.runUserSub(false, "main","rb_mouseclicked", _eventdata);
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 40;BA.debugLine="Sub RB_MouseClicked(EventData As MouseEvent)";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="Log(SLRadioButton_Static.Cast(Sender).Selected)";
Debug.ShouldStop(256);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main._slradiobutton_static.runMethod(false,"_cast",(Object)((main.__c.runMethod(false,"Sender",main.ba)))).runClassMethod (b4j.example.slradiobutton.class, "_getselected"))));
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rb_selectedchange(RemoteObject _selected) throws Exception{
try {
		Debug.PushSubsStack("RB_SelectedChange (main) ","main",0,main.ba,main.mostCurrent,44);
if (RapidSub.canDelegate("rb_selectedchange")) return main.remoteMe.runUserSub(false, "main","rb_selectedchange", _selected);
Debug.locals.put("Selected", _selected);
 BA.debugLineNum = 44;BA.debugLine="Sub RB_SelectedChange(Selected As Boolean)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="Log(\"Button From Code Changed \" & Selected)";
Debug.ShouldStop(4096);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Button From Code Changed "),_selected)));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rbgroup1_selectedchange(RemoteObject _selected) throws Exception{
try {
		Debug.PushSubsStack("RBGroup1_SelectedChange (main) ","main",0,main.ba,main.mostCurrent,56);
if (RapidSub.canDelegate("rbgroup1_selectedchange")) return main.remoteMe.runUserSub(false, "main","rbgroup1_selectedchange", _selected);
RemoteObject _slrb = RemoteObject.declareNull("b4j.example.slradiobutton");
Debug.locals.put("Selected", _selected);
 BA.debugLineNum = 56;BA.debugLine="Sub RBGroup1_SelectedChange(Selected As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="Dim SLRb As SLRadioButton = Sender";
Debug.ShouldStop(16777216);
_slrb = (main.__c.runMethod(false,"Sender",main.ba));Debug.locals.put("SLRb", _slrb);Debug.locals.put("SLRb", _slrb);
 BA.debugLineNum = 58;BA.debugLine="Log(\"FixedWidth button changed \"& SLRb.Label.Text";
Debug.ShouldStop(33554432);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("FixedWidth button changed "),_slrb.runClassMethod (b4j.example.slradiobutton.class, "_getlabel").runMethod(true,"getText"))));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _slradiobutton1_selectedchange(RemoteObject _selected) throws Exception{
try {
		Debug.PushSubsStack("SLRadioButton1_SelectedChange (main) ","main",0,main.ba,main.mostCurrent,48);
if (RapidSub.canDelegate("slradiobutton1_selectedchange")) return main.remoteMe.runUserSub(false, "main","slradiobutton1_selectedchange", _selected);
Debug.locals.put("Selected", _selected);
 BA.debugLineNum = 48;BA.debugLine="Sub SLRadioButton1_SelectedChange(Selected As Bool";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="Log(\"CustomView in Designer Changed \" & Selected)";
Debug.ShouldStop(65536);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("CustomView in Designer Changed "),_selected)));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
}