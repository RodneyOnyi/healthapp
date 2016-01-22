/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthapp;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

/**
 * @author iLabAfrica
 */
public class health extends MIDlet implements CommandListener, ItemStateListener {
    
    private boolean midletPaused = false;

//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private java.util.Hashtable __previousDisplayables = new java.util.Hashtable();
    private Command exitCommand;
    private Command exitCommand1;
    private Command itemCommand;
    private Command exit_app;
    private Command check_signs;
    private Command mainpage;
    private Command main_page;
    private Command screenCommand1;
    private Command screenCommand2;
    private Command backCommand;
    private Command exitCommand3;
    private Command exitCommand2;
    private Command backCommand1;
    private Command screenCommand3;
    private Command exitCommand4;
    private Form form;
    private ChoiceGroup choiceGroup;
    private ChoiceGroup choiceGroup1;
    private Form symptoms;
    private StringItem stringItem1;
    private StringItem stringItem;
    private Form main_symptoms;
    private StringItem stringItem2;
    private Form diarhhoea;
    private Form breathing;
    private ChoiceGroup choiceGroup2;
    private ChoiceGroup choiceGroup3;
    private TextField textField;
    private Form d_breathing1;
    private TextField textField1;
    private Font font;
//</editor-fold>//GEN-END:|fields|0|

    /**
     * The HelloMIDlet constructor.
     */
    public health() {
    }

//<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
    /**
     * Switches a display to previous displayable of the current displayable.
     * The <code>display</code> instance is obtain from the
     * <code>getDisplay</code> method.
     */
    private void switchToPreviousDisplayable() {
        Displayable __currentDisplayable = getDisplay().getCurrent();
        if (__currentDisplayable != null) {
            Displayable __nextDisplayable = (Displayable) __previousDisplayables.get(__currentDisplayable);
            if (__nextDisplayable != null) {
                switchDisplayable(null, __nextDisplayable);
            }
        }
    }
//</editor-fold>//GEN-END:|methods|0|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initializes the application. It is called only once when the MIDlet is
     * started. The method is called before the <code>startMIDlet</code> method.
     */
    private void initialize() {
//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
}//GEN-BEGIN:|0-initialize|2|
//</editor-fold>//GEN-END:|0-initialize|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {
//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
switchDisplayable(null, getForm());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
}//GEN-BEGIN:|3-startMIDlet|2|
//</editor-fold>//GEN-END:|3-startMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {
//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
}//GEN-BEGIN:|4-resumeMIDlet|2|
//</editor-fold>//GEN-END:|4-resumeMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The <code>display</code>
     * instance is taken from <code>getDisplay</code> method. This method is
     * used by all actions in the design for switching displayable.
     *
     * @param alert the Alert which is temporarily set to the display; if
     * <code>null</code>, then <code>nextDisplayable</code> is set immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {
//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        Displayable __currentDisplayable = display.getCurrent();
        if (__currentDisplayable != null && nextDisplayable != null) {
            __previousDisplayables.put(nextDisplayable, __currentDisplayable);
        }
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
}//GEN-BEGIN:|5-switchDisplayable|2|
//</editor-fold>//GEN-END:|5-switchDisplayable|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a
     * particular displayable.
     *
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {
//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
if (displayable == breathing) {//GEN-BEGIN:|7-commandAction|1|78-preAction
            if (command == backCommand1) {//GEN-END:|7-commandAction|1|78-preAction
                // write pre-action user code here
//GEN-LINE:|7-commandAction|2|78-postAction
                // write post-action user code here
} else if (command == exitCommand3) {//GEN-LINE:|7-commandAction|3|70-preAction
                // write pre-action user code here
exitMIDlet();//GEN-LINE:|7-commandAction|4|70-postAction
                // write post-action user code here
} else if (command == screenCommand3) {//GEN-LINE:|7-commandAction|5|76-preAction
                // write pre-action user code here
    String text = textField.getString(); 
    int check = Integer.parseInt(text);
        if((choiceGroup2.isSelected(0))&&(check>=50)){
            if((choiceGroup3.isSelected(0))&&(choiceGroup3.isSelected(1))&&(choiceGroup3.isSelected(2))){
                switchDisplayable(null, getD_breathing1()); 
            }
        }else{
            textField.setString("Hello, " + textField.getString());
        } 
//GEN-LINE:|7-commandAction|6|76-postAction
                // write post-action user code here
}//GEN-BEGIN:|7-commandAction|7|87-preAction
} else if (displayable == d_breathing1) {
    if (command == exitCommand4) {//GEN-END:|7-commandAction|7|87-preAction
        // write pre-action user code here
exitMIDlet();//GEN-LINE:|7-commandAction|8|87-postAction
        // write post-action user code here
}//GEN-BEGIN:|7-commandAction|9|67-preAction
} else if (displayable == diarhhoea) {
    if (command == exitCommand2) {//GEN-END:|7-commandAction|9|67-preAction
        // write pre-action user code here
exitMIDlet();//GEN-LINE:|7-commandAction|10|67-postAction
        // write post-action user code here
}//GEN-BEGIN:|7-commandAction|11|38-preAction
} else if (displayable == form) {
    if (command == check_signs) {//GEN-END:|7-commandAction|11|38-preAction
                // write pre-action user code here
  if((choiceGroup.isSelected(0))||(choiceGroup.isSelected(1))||(choiceGroup.isSelected(2))||(choiceGroup1.isSelected(0))||(choiceGroup1.isSelected(1))){
      switchDisplayable(null,getSymptoms() ); 
//GEN-LINE:|7-commandAction|12|38-postAction
  }else{
      switchDisplayable(null, getMain_symptoms());  
  } 
// write post-action user code here
} else if (command == exitCommand) {//GEN-LINE:|7-commandAction|13|19-preAction
      
// write pre-action user code here
exitMIDlet();//GEN-LINE:|7-commandAction|14|19-postAction
                // write post-action user code here
} else if (command == exit_app) {//GEN-LINE:|7-commandAction|15|33-preAction
                // write pre-action user code here
exitMIDlet();//GEN-LINE:|7-commandAction|16|33-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|17|43-preAction
} else if (displayable == main_symptoms) {
    if (command == mainpage) {//GEN-END:|7-commandAction|17|43-preAction
        // write pre-action user code here
switchToPreviousDisplayable();//GEN-LINE:|7-commandAction|18|43-postAction
 // write post-action user code here
} else if (command == screenCommand1) {//GEN-LINE:|7-commandAction|19|56-preAction
        // write pre-action user code here
switchDisplayable(null, getDiarhhoea());//GEN-LINE:|7-commandAction|20|56-postAction
        // write post-action user code here
} else if (command == screenCommand2) {//GEN-LINE:|7-commandAction|21|58-preAction
        // write pre-action user code here
switchDisplayable(null, getBreathing());//GEN-LINE:|7-commandAction|22|58-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|23|52-preAction
} else if (displayable == symptoms) {
    if (command == check_signs) {//GEN-END:|7-commandAction|23|52-preAction
 // write pre-action user code here
switchDisplayable(null, getMain_symptoms());//GEN-LINE:|7-commandAction|24|52-postAction
 // write post-action user code here
} else if (command == main_page) {//GEN-LINE:|7-commandAction|25|46-preAction
 // write pre-action user code here
switchToPreviousDisplayable();//GEN-LINE:|7-commandAction|26|46-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|27|7-postCommandAction
        }//GEN-END:|7-commandAction|27|7-postCommandAction
        // write post-action user code here
}//GEN-BEGIN:|7-commandAction|28|
//</editor-fold>//GEN-END:|7-commandAction|28|



//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|18-getter|0|18-preInit
    /**
     * Returns an initialized instance of exitCommand component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand() {
        if (exitCommand == null) {
//GEN-END:|18-getter|0|18-preInit
            // write pre-init user code here
exitCommand = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|18-getter|1|18-postInit
            // write post-init user code here
}//GEN-BEGIN:|18-getter|2|
        return exitCommand;
    }
//</editor-fold>//GEN-END:|18-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: form ">//GEN-BEGIN:|14-getter|0|14-preInit
    /**
     * Returns an initialized instance of form component.
     *
     * @return the initialized component instance
     */
    public Form getForm() {
        if (form == null) {
//GEN-END:|14-getter|0|14-preInit
            // write pre-init user code here
form = new Form("General Danger Signs", new Item[]{getChoiceGroup(), getChoiceGroup1()});//GEN-BEGIN:|14-getter|1|14-postInit
            form.addCommand(getExitCommand());
            form.addCommand(getExit_app());
            form.addCommand(getCheck_signs());
            form.setCommandListener(this);//GEN-END:|14-getter|1|14-postInit
            // write post-init user code here
}//GEN-BEGIN:|14-getter|2|
        return form;
    }
//</editor-fold>//GEN-END:|14-getter|2|





//<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup ">//GEN-BEGIN:|23-getter|0|23-preInit
    /**
     * Returns an initialized instance of choiceGroup component.
     *
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup() {
        if (choiceGroup == null) {
//GEN-END:|23-getter|0|23-preInit
 // write pre-init user code here
choiceGroup = new ChoiceGroup("Ask", Choice.MULTIPLE);//GEN-BEGIN:|23-getter|1|23-postInit
            choiceGroup.append("Is the child able to drink or breastfeed?", null);
            choiceGroup.append("Does the child vomit everything?", null);
            choiceGroup.append("Has the child had convulsions?", null);
            choiceGroup.setFitPolicy(Choice.TEXT_WRAP_DEFAULT);
            choiceGroup.setSelectedFlags(new boolean[]{false, false, false});
            choiceGroup.setPreferredSize(-1, -1);//GEN-END:|23-getter|1|23-postInit
            
// write post-init user code here
}//GEN-BEGIN:|23-getter|2|
        return choiceGroup;
    }
//</editor-fold>//GEN-END:|23-getter|2|

    public boolean isMidletPaused() {
        return midletPaused;
    }

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand1 ">//GEN-BEGIN:|27-getter|0|27-preInit
    /**
     * Returns an initialized instance of exitCommand1 component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand1() {
        if (exitCommand1 == null) {
//GEN-END:|27-getter|0|27-preInit
 // write pre-init user code here
exitCommand1 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|27-getter|1|27-postInit
 // write post-init user code here
}//GEN-BEGIN:|27-getter|2|
        return exitCommand1;
    }
//</editor-fold>//GEN-END:|27-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup1 ">//GEN-BEGIN:|29-getter|0|29-preInit
    /**
     * Returns an initialized instance of choiceGroup1 component.
     *
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup1() {
        if (choiceGroup1 == null) {
//GEN-END:|29-getter|0|29-preInit
 // write pre-init user code here
choiceGroup1 = new ChoiceGroup("Look", Choice.MULTIPLE);//GEN-BEGIN:|29-getter|1|29-postInit
            choiceGroup1.append("See if the child is lethergic or unconscious.", null);
            choiceGroup1.append("Is the child convulsing now?", null);
            choiceGroup1.setSelectedFlags(new boolean[]{false, false});//GEN-END:|29-getter|1|29-postInit
 // write post-init user code here
}//GEN-BEGIN:|29-getter|2|
        return choiceGroup1;
    }
//</editor-fold>//GEN-END:|29-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exit_app ">//GEN-BEGIN:|32-getter|0|32-preInit
    /**
     * Returns an initialized instance of exit_app component.
     *
     * @return the initialized component instance
     */
    public Command getExit_app() {
        if (exit_app == null) {
//GEN-END:|32-getter|0|32-preInit
 // write pre-init user code here
exit_app = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|32-getter|1|32-postInit
 // write post-init user code here
}//GEN-BEGIN:|32-getter|2|
        return exit_app;
    }
//</editor-fold>//GEN-END:|32-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemCommand ">//GEN-BEGIN:|35-getter|0|35-preInit
    /**
     * Returns an initialized instance of itemCommand component.
     *
     * @return the initialized component instance
     */
    public Command getItemCommand() {
        if (itemCommand == null) {
//GEN-END:|35-getter|0|35-preInit
 // write pre-init user code here
itemCommand = new Command("Item", Command.ITEM, 0);//GEN-LINE:|35-getter|1|35-postInit
 // write post-init user code here
}//GEN-BEGIN:|35-getter|2|
        return itemCommand;
    }
//</editor-fold>//GEN-END:|35-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: check_signs ">//GEN-BEGIN:|37-getter|0|37-preInit
    /**
     * Returns an initialized instance of check_signs component.
     *
     * @return the initialized component instance
     */
    public Command getCheck_signs() {
        if (check_signs == null) {
//GEN-END:|37-getter|0|37-preInit
 // write pre-init user code here
check_signs = new Command("Next", Command.SCREEN, 0);//GEN-LINE:|37-getter|1|37-postInit
 // write post-init user code here
}//GEN-BEGIN:|37-getter|2|
        return check_signs;
    }
//</editor-fold>//GEN-END:|37-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: symptoms ">//GEN-BEGIN:|39-getter|0|39-preInit
    /**
     * Returns an initialized instance of symptoms component.
     *
     * @return the initialized component instance
     */
    public Form getSymptoms() {
        if (symptoms == null) {
//GEN-END:|39-getter|0|39-preInit
 // write pre-init user code here
symptoms = new Form("symptoms", new Item[]{getStringItem1(), getStringItem()});//GEN-BEGIN:|39-getter|1|39-postInit
            symptoms.addCommand(getMain_page());
            symptoms.addCommand(getCheck_signs());
            symptoms.setCommandListener(this);//GEN-END:|39-getter|1|39-postInit
 // write post-init user code here
}//GEN-BEGIN:|39-getter|2|
        return symptoms;
    }
//</editor-fold>//GEN-END:|39-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: main_symptoms ">//GEN-BEGIN:|40-getter|0|40-preInit
    /**
     * Returns an initialized instance of main_symptoms component.
     *
     * @return the initialized component instance
     */
    public Form getMain_symptoms() {
        if (main_symptoms == null) {
//GEN-END:|40-getter|0|40-preInit
 // write pre-init user code here
main_symptoms = new Form("Main Symptoms", new Item[]{getStringItem2()});//GEN-BEGIN:|40-getter|1|40-postInit
            main_symptoms.addCommand(getMainpage());
            main_symptoms.addCommand(getScreenCommand1());
            main_symptoms.addCommand(getScreenCommand2());
            main_symptoms.setCommandListener(this);//GEN-END:|40-getter|1|40-postInit
 // write post-init user code here
}//GEN-BEGIN:|40-getter|2|
        return main_symptoms;
    }
//</editor-fold>//GEN-END:|40-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: mainpage ">//GEN-BEGIN:|42-getter|0|42-preInit
    /**
     * Returns an initialized instance of mainpage component.
     *
     * @return the initialized component instance
     */
    public Command getMainpage() {
        if (mainpage == null) {
//GEN-END:|42-getter|0|42-preInit
 // write pre-init user code here
mainpage = new Command("Back", Command.BACK, 0);//GEN-LINE:|42-getter|1|42-postInit
 // write post-init user code here
}//GEN-BEGIN:|42-getter|2|
        return mainpage;
    }
//</editor-fold>//GEN-END:|42-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: main_page ">//GEN-BEGIN:|45-getter|0|45-preInit
    /**
     * Returns an initialized instance of main_page component.
     *
     * @return the initialized component instance
     */
    public Command getMain_page() {
        if (main_page == null) {
//GEN-END:|45-getter|0|45-preInit
 // write pre-init user code here
main_page = new Command("Back", Command.BACK, 0);//GEN-LINE:|45-getter|1|45-postInit
 // write post-init user code here
}//GEN-BEGIN:|45-getter|2|
        return main_page;
    }
//</editor-fold>//GEN-END:|45-getter|2|



//<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem ">//GEN-BEGIN:|49-getter|0|49-preInit
    /**
     * Returns an initialized instance of stringItem component.
     *
     * @return the initialized component instance
     */
    public StringItem getStringItem() {
        if (stringItem == null) {
//GEN-END:|49-getter|0|49-preInit
 // write pre-init user code here
stringItem = new StringItem("Warning", "\nThis child needs URGENT attention, complete the assesment and any pre-referal treatment immediately so that the referall is not delayed.", Item.PLAIN);//GEN-BEGIN:|49-getter|1|49-postInit
            stringItem.setLayout(ImageItem.LAYOUT_DEFAULT | ImageItem.LAYOUT_NEWLINE_BEFORE);
            stringItem.setFont(getFont());//GEN-END:|49-getter|1|49-postInit
 // write post-init user code here
}//GEN-BEGIN:|49-getter|2|
        return stringItem;
    }
//</editor-fold>//GEN-END:|49-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: font ">//GEN-BEGIN:|50-getter|0|50-preInit
    /**
     * Returns an initialized instance of font component.
     *
     * @return the initialized component instance
     */
    public Font getFont() {
        if (font == null) {
//GEN-END:|50-getter|0|50-preInit
 // write pre-init user code here
font = Font.getFont(Font.FACE_PROPORTIONAL, Font.STYLE_BOLD, Font.SIZE_MEDIUM);//GEN-LINE:|50-getter|1|50-postInit
 // write post-init user code here
}//GEN-BEGIN:|50-getter|2|
        return font;
    }
//</editor-fold>//GEN-END:|50-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem1 ">//GEN-BEGIN:|51-getter|0|51-preInit
    /**
     * Returns an initialized instance of stringItem1 component.
     *
     * @return the initialized component instance
     */
    public StringItem getStringItem1() {
        if (stringItem1 == null) {
//GEN-END:|51-getter|0|51-preInit
 // write pre-init user code here
stringItem1 = new StringItem("", "");//GEN-LINE:|51-getter|1|51-postInit
 // write post-init user code here
}//GEN-BEGIN:|51-getter|2|
        return stringItem1;
    }
//</editor-fold>//GEN-END:|51-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: screenCommand1 ">//GEN-BEGIN:|55-getter|0|55-preInit
    /**
     * Returns an initialized instance of screenCommand1 component.
     *
     * @return the initialized component instance
     */
    public Command getScreenCommand1() {
        if (screenCommand1 == null) {
//GEN-END:|55-getter|0|55-preInit
 // write pre-init user code here
screenCommand1 = new Command("No", Command.SCREEN, 0);//GEN-LINE:|55-getter|1|55-postInit
 // write post-init user code here
}//GEN-BEGIN:|55-getter|2|
        return screenCommand1;
    }
//</editor-fold>//GEN-END:|55-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: screenCommand2 ">//GEN-BEGIN:|57-getter|0|57-preInit
    /**
     * Returns an initialized instance of screenCommand2 component.
     *
     * @return the initialized component instance
     */
    public Command getScreenCommand2() {
        if (screenCommand2 == null) {
//GEN-END:|57-getter|0|57-preInit
 // write pre-init user code here
screenCommand2 = new Command("Yes", Command.SCREEN, 0);//GEN-LINE:|57-getter|1|57-postInit
 // write post-init user code here
}//GEN-BEGIN:|57-getter|2|
        return screenCommand2;
    }
//</editor-fold>//GEN-END:|57-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem2 ">//GEN-BEGIN:|54-getter|0|54-preInit
    /**
     * Returns an initialized instance of stringItem2 component.
     *
     * @return the initialized component instance
     */
    public StringItem getStringItem2() {
        if (stringItem2 == null) {
//GEN-END:|54-getter|0|54-preInit
 // write pre-init user code here
stringItem2 = new StringItem("", "Does the child have a cough or difficulty breathing? ");//GEN-BEGIN:|54-getter|1|54-postInit
            stringItem2.setFont(getFont());//GEN-END:|54-getter|1|54-postInit
 // write post-init user code here
}//GEN-BEGIN:|54-getter|2|
        return stringItem2;
    }
//</editor-fold>//GEN-END:|54-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: diarhhoea ">//GEN-BEGIN:|59-getter|0|59-preInit
    /**
     * Returns an initialized instance of diarhhoea component.
     *
     * @return the initialized component instance
     */
    public Form getDiarhhoea() {
        if (diarhhoea == null) {
//GEN-END:|59-getter|0|59-preInit
 // write pre-init user code here
diarhhoea = new Form("Diarhhoea");//GEN-BEGIN:|59-getter|1|59-postInit
            diarhhoea.addCommand(getExitCommand2());
            diarhhoea.setCommandListener(this);//GEN-END:|59-getter|1|59-postInit
 // write post-init user code here
}//GEN-BEGIN:|59-getter|2|
        return diarhhoea;
    }
//</editor-fold>//GEN-END:|59-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: breathing ">//GEN-BEGIN:|60-getter|0|60-preInit
    /**
     * Returns an initialized instance of breathing component.
     *
     * @return the initialized component instance
     */
    public Form getBreathing() {
        if (breathing == null) {
//GEN-END:|60-getter|0|60-preInit
 // write pre-init user code here
breathing = new Form("Breathing", new Item[]{getChoiceGroup2(), getTextField(), getChoiceGroup3()});//GEN-BEGIN:|60-getter|1|60-postInit
            breathing.addCommand(getExitCommand3());
            breathing.addCommand(getScreenCommand3());
            breathing.addCommand(getBackCommand1());
            breathing.setCommandListener(this);//GEN-END:|60-getter|1|60-postInit
 // write post-init user code here
}//GEN-BEGIN:|60-getter|2|
        return breathing;
    }
//</editor-fold>//GEN-END:|60-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand ">//GEN-BEGIN:|63-getter|0|63-preInit
    /**
     * Returns an initialized instance of backCommand component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand() {
        if (backCommand == null) {
//GEN-END:|63-getter|0|63-preInit
 // write pre-init user code here
backCommand = new Command("Back", Command.BACK, 0);//GEN-LINE:|63-getter|1|63-postInit
 // write post-init user code here
}//GEN-BEGIN:|63-getter|2|
        return backCommand;
    }
//</editor-fold>//GEN-END:|63-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand2 ">//GEN-BEGIN:|66-getter|0|66-preInit
    /**
     * Returns an initialized instance of exitCommand2 component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand2() {
        if (exitCommand2 == null) {
//GEN-END:|66-getter|0|66-preInit
 // write pre-init user code here
exitCommand2 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|66-getter|1|66-postInit
 // write post-init user code here
}//GEN-BEGIN:|66-getter|2|
        return exitCommand2;
    }
//</editor-fold>//GEN-END:|66-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand3 ">//GEN-BEGIN:|69-getter|0|69-preInit
    /**
     * Returns an initialized instance of exitCommand3 component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand3() {
        if (exitCommand3 == null) {
//GEN-END:|69-getter|0|69-preInit
 // write pre-init user code here
exitCommand3 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|69-getter|1|69-postInit
 // write post-init user code here
}//GEN-BEGIN:|69-getter|2|
        return exitCommand3;
    }
//</editor-fold>//GEN-END:|69-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: screenCommand3 ">//GEN-BEGIN:|75-getter|0|75-preInit
    /**
     * Returns an initialized instance of screenCommand3 component.
     *
     * @return the initialized component instance
     */
    public Command getScreenCommand3() {
        if (screenCommand3 == null) {
//GEN-END:|75-getter|0|75-preInit
 // write pre-init user code here
screenCommand3 = new Command("Next", Command.SCREEN, 0);//GEN-LINE:|75-getter|1|75-postInit
 // write post-init user code here
}//GEN-BEGIN:|75-getter|2|
        return screenCommand3;
    }
//</editor-fold>//GEN-END:|75-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand1 ">//GEN-BEGIN:|77-getter|0|77-preInit
    /**
     * Returns an initialized instance of backCommand1 component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand1() {
        if (backCommand1 == null) {
//GEN-END:|77-getter|0|77-preInit
 // write pre-init user code here
backCommand1 = new Command("Back", Command.BACK, 0);//GEN-LINE:|77-getter|1|77-postInit
 // write post-init user code here
}//GEN-BEGIN:|77-getter|2|
        return backCommand1;
    }
//</editor-fold>//GEN-END:|77-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup2 ">//GEN-BEGIN:|72-getter|0|72-preInit
    /**
     * Returns an initialized instance of choiceGroup2 component.
     *
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup2() {
        if (choiceGroup2 == null) {
//GEN-END:|72-getter|0|72-preInit
 // write pre-init user code here
choiceGroup2 = new ChoiceGroup("How old is the child?", Choice.EXCLUSIVE);//GEN-BEGIN:|72-getter|1|72-postInit
            choiceGroup2.append("2 - 12 months", null);
            choiceGroup2.append("12 months - 5 years", null);
            choiceGroup2.setSelectedFlags(new boolean[]{false, false});//GEN-END:|72-getter|1|72-postInit
 // write post-init user code here
}//GEN-BEGIN:|72-getter|2|
        return choiceGroup2;
    }
//</editor-fold>//GEN-END:|72-getter|2|



//<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup3 ">//GEN-BEGIN:|80-getter|0|80-preInit
    /**
     * Returns an initialized instance of choiceGroup3 component.
     *
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup3() {
        if (choiceGroup3 == null) {
//GEN-END:|80-getter|0|80-preInit
 // write pre-init user code here
choiceGroup3 = new ChoiceGroup("Breathing Symptoms", Choice.MULTIPLE);//GEN-BEGIN:|80-getter|1|80-postInit
            choiceGroup3.append("Chest indrawing", null);
            choiceGroup3.append("Stidor", null);
            choiceGroup3.append("Wheezing", null);
            choiceGroup3.setSelectedFlags(new boolean[]{false, false, false});//GEN-END:|80-getter|1|80-postInit
 // write post-init user code here
}//GEN-BEGIN:|80-getter|2|
        return choiceGroup3;
    }
//</editor-fold>//GEN-END:|80-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: d_breathing1 ">//GEN-BEGIN:|85-getter|0|85-preInit
    /**
     * Returns an initialized instance of d_breathing1 component.
     *
     * @return the initialized component instance
     */
    public Form getD_breathing1() {
        if (d_breathing1 == null) {
//GEN-END:|85-getter|0|85-preInit
 // write pre-init user code here
d_breathing1 = new Form("d_breathing1", new Item[]{getTextField1()});//GEN-BEGIN:|85-getter|1|85-postInit
            d_breathing1.addCommand(getExitCommand4());
            d_breathing1.setCommandListener(this);//GEN-END:|85-getter|1|85-postInit
 // write post-init user code here
}//GEN-BEGIN:|85-getter|2|
        return d_breathing1;
    }
//</editor-fold>//GEN-END:|85-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand4 ">//GEN-BEGIN:|86-getter|0|86-preInit
    /**
     * Returns an initialized instance of exitCommand4 component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand4() {
        if (exitCommand4 == null) {
//GEN-END:|86-getter|0|86-preInit
 // write pre-init user code here
exitCommand4 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|86-getter|1|86-postInit
 // write post-init user code here
}//GEN-BEGIN:|86-getter|2|
        return exitCommand4;
    }
//</editor-fold>//GEN-END:|86-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField1 ">//GEN-BEGIN:|89-getter|0|89-preInit
    /**
     * Returns an initialized instance of textField1 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField1() {
        if (textField1 == null) {
//GEN-END:|89-getter|0|89-preInit
 // write pre-init user code here
textField1 = new TextField("textField1", null, 32, TextField.ANY);//GEN-LINE:|89-getter|1|89-postInit
 // write post-init user code here
}//GEN-BEGIN:|89-getter|2|
        return textField1;
    }
//</editor-fold>//GEN-END:|89-getter|2|





//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField ">//GEN-BEGIN:|92-getter|0|92-preInit
    /**
     * Returns an initialized instance of textField component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField() {
        if (textField == null) {
//GEN-END:|92-getter|0|92-preInit
 // write pre-init user code here
textField = new TextField("Breaths in one minute?", "", 32, TextField.ANY);//GEN-LINE:|92-getter|1|92-postInit
 // write post-init user code here
}//GEN-BEGIN:|92-getter|2|
        return textField;
    }
//</editor-fold>//GEN-END:|92-getter|2|

    /**
     * Returns a display instance.
     *
     * @return the display instance.
     */
    public Display getDisplay() {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable(null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started. Checks whether the MIDlet have been
     * already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet();
        } else {
            initialize();
            startMIDlet();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     *
     * @param unconditional if true, then the MIDlet has to be unconditionally
     * terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }

    public void itemStateChanged(Item item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
