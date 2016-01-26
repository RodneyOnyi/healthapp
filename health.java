/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthapp;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

/**
 * @author Rodney Onyango
 */
public class healthapp extends MIDlet implements CommandListener{
    
    private final Form formHome,formMainSymptoms,formBreathing,formFever,formDiarrhoea,formDiarrhoeaDiagnose, formEnd,formFeverDiagnose;
    private final Command cmdExit, cmdOk, cmdBack,cmdYes,cmdNo,cmdNext;
    private final StringItem main_symptoms,fever,diarrhoea,end_msg,ask;
    private final TextField breaths,d_days, f_days;
    private final Display display;
    private final List lstMain1, lstMain2,lstMain3,
            lstdiarrohoea1,lstdiarrohoea2,lstdiarrohoea3,lstdiarrohoea4,lstdiarrohoea5,lstdiarrohoea6
            ,lstfever1,lstfever2,lstfever3,lstfever4,lstfever5,lstfever6;
    private final Alert alertWarning;
    private final ChoiceGroup homeAsk,homeLook,age,breathingSymptoms,diarrhoeaAsk,diarrhoeaLook,diarrhoeaLook1,diarrhoeaLook2,diarrhoeaLook3,feverAsk,feverLook,feverUlcers;

    public healthapp(){
        //initializing 
        //commands
        
        cmdExit = new Command("Exit", Command.EXIT, 0);
        cmdOk = new Command("OK", Command.OK, 0);
        cmdBack = new Command("Back", Command.BACK, 0);
        cmdNext = new Command("Next", Command.OK, 0);
        cmdYes = new Command("Yes", Command.OK, 0);
        cmdNo = new Command("No", Command.OK, 0);
       
        //Diagnosis List
        //Breathing Diagnosis
        String breathingDiagnosis1[] = new String[]{"Give first dose of an appropriate antibiotic ", "Refer URGENTLY to hospital*"};
        lstMain1 = new List("SEVERE PNEUMONIA OR VERY SEVERE DISEASE", List.IMPLICIT, breathingDiagnosis1, null);
        lstMain1.addCommand(cmdBack);
        lstMain1.addCommand(cmdNext);
        lstMain1.setCommandListener(this);
        
        String breathingDiagnosis2[] = new String[]{"Give oral antibiotic for 3 days", "If wheezing (even if it disappeared after rapidly acting bronchodilator) give an inhaled bronchodilator for 5 days**","Soothe the throat and relieve the cough with a safe remedy","If coughing for more than 3 weeks or if having recurrent wheezing, refer for assessment for TB or asthma","Advise the mother when to return immediately","Follow-up in 2 days"};
        lstMain2= new List("PNEUMONIA", List.IMPLICIT, breathingDiagnosis2, null);
        lstMain2.addCommand(cmdBack);
        lstMain2.addCommand(cmdNext);
        lstMain2.setCommandListener(this);
        
        String breathingDiagnosis3[] = new String[]{"If wheezing (even if it disappeared after rapidly acting bronchodilator) give an inhaled bronchodilator for 5 days**","Soothe the throat and relieve the cough with a safe remedy","If coughing for more than 3 weeks or if having recurrent wheezing, refer for assessment for TB or asthma","Advise mother when to return immediately","Follow up in 5 days if not improving"};
        lstMain3 = new List("COUGH OR COLD", List.IMPLICIT, breathingDiagnosis3, null);
        lstMain3.addCommand(cmdBack);
        lstMain3.addCommand(cmdNext);
        lstMain3.setCommandListener(this);
        
        //Fever Diagnosis       
        
        String diarrhoeaDiagnosis1[] = new String[]{"If child has no other severe classification:Give fluid for severe dehydration (Plan C)\n" +"OR\n" +"If child also has another severe classification: Refer URGENTLY to hospital with mother giving frequent sips of ORS on the way. Advise the mother to continue breastfeeding","If child is 2 years or older and there is cholera in your area, give antibiotic for cholera"};
        lstdiarrohoea1 = new List("SEVERE DEHYDRATION", List.IMPLICIT, diarrhoeaDiagnosis1, null);
        lstdiarrohoea1.addCommand(cmdBack);
        lstdiarrohoea1.addCommand(cmdNext);
        lstdiarrohoea1.setCommandListener(this);
        
        String diarrhoeaDiagnosis2[] = new String[]{"Give fluid, zinc supplements and food for some dehydration (Plan B) "," If child also has a severe classification:Refer URGENTLY to hospital with mother giving frequent sips of ORS on the way. Advise the mother to continue breastfeeding","Advise mother when to return immediately","Follow-up in 5 days if not improving"};
        lstdiarrohoea2 = new List("SOME DEHYDRATION", List.IMPLICIT, diarrhoeaDiagnosis2, null);
        lstdiarrohoea2.addCommand(cmdBack);
        lstdiarrohoea2.addCommand(cmdNext);
        lstdiarrohoea2.setCommandListener(this);
        
        String diarrhoeaDiagnosis3[] = new String[]{"Give fluid, zinc supplements and food to treat diarrhoea at home (Plan A)","Advise mother when to return immediately","Follow-up in 5 days if not improving"};
        lstdiarrohoea3 = new List("NO DEHYDRATION", List.IMPLICIT, diarrhoeaDiagnosis3, null);
        lstdiarrohoea3.addCommand(cmdBack);
        lstdiarrohoea3.addCommand(cmdNext);
        lstdiarrohoea3.setCommandListener(this);
        
        String diarrhoeaDiagnosis4[] = new String[]{">Treat dehydration before referral unless the child has another severe classification","Refer to hospital"};
        lstdiarrohoea4 = new List("SEVERE PERSISTENT DIARRHOEA", List.IMPLICIT, diarrhoeaDiagnosis4, null);
        lstdiarrohoea4.addCommand(cmdBack);
        lstdiarrohoea4.addCommand(cmdNext);
        lstdiarrohoea4.setCommandListener(this);
        
        String diarrhoeaDiagnosis5[] = new String[]{"Advise the mother on feeding a child who has PERSISTENT DIARRHOEA","Give multivitamins and minerals (including zinc) for 14 days","Follow up in 5 days"};
        lstdiarrohoea5 = new List("PERSISTENT DIARRHOEA", List.IMPLICIT, diarrhoeaDiagnosis5, null);
        lstdiarrohoea5.addCommand(cmdBack);
        lstdiarrohoea5.addCommand(cmdNext);
        lstdiarrohoea5.setCommandListener(this);
        
        String diarrhoeaDiagnosis6[] = new String[]{"Give ciprofloxacin for 3 days","Follow-up in 2 days"};
        lstdiarrohoea6 = new List("DYSENTERY", List.IMPLICIT, diarrhoeaDiagnosis6, null);
        lstdiarrohoea6.addCommand(cmdBack);
        lstdiarrohoea6.addCommand(cmdNext);
        lstdiarrohoea6.setCommandListener(this);
        
        //Fever Diagnosis
        String feverDiagnosis1[] = new String[]{"Give quinine for severe malaria (first dose)","Give first dose of an appropriate antibiotic","Treat the child to prevent low blood sugar"," Give one dose of paracetamol in clinic for high fever (38.5°C or above)","Refer URGENTLY to hospital"};
        lstfever1 = new List("VERY SEVERE FEBRILE DISEASE", List.IMPLICIT, feverDiagnosis1, null);
        lstfever1.addCommand(cmdBack);
        lstfever1.addCommand(cmdNext);
        lstfever1.setCommandListener(this);
        
        String feverDiagnosis2[] = new String[]{"Give oral co-artemether or other recommended antimalarial","Give one dose of paracetamol in clinic for high fever (38.5°C or above)","Advise mother when to return immediately","Follow-up in 2 days if fever persists","If fever is present every day for more than 7 days, refer for assessment"};
        lstfever2 = new List("MALARIA", List.IMPLICIT, feverDiagnosis2, null);
        lstfever2.addCommand(cmdBack);
        lstfever2.addCommand(cmdNext);
        lstfever2.setCommandListener(this);
        
        String feverDiagnosis3[] = new String[]{"> Give one dose of paracetamol in clinic for high fever (38.5°C or above)","Advise mother when to return immediately","Follow-up in 2 days if fever persists","If fever is present every day for more than 7 days, refer for assessment"};
        lstfever3 = new List("FEVER - MALARIA UNLIKEY", List.IMPLICIT, feverDiagnosis3, null);
        lstfever3.addCommand(cmdBack);
        lstfever3.addCommand(cmdNext);
        lstfever3.setCommandListener(this);
        
        String feverDiagnosis4[] = new String[]{"Give Vitamin A treatment","Give first dose of an appropriate antibiotic","If clouding of the cornea or pus draining from the eye, apply tetracycline eye ointment","Refer URGENTLY to hospital"};
        lstfever4 = new List("SEVERE COMPLICATED MEASLES", List.IMPLICIT, feverDiagnosis4, null);
        lstfever4.addCommand(cmdBack);
        lstfever4.addCommand(cmdNext);
        lstfever4.setCommandListener(this);
        
        String feverDiagnosis5[] = new String[]{"Give Vitamin A treatment","If pus draining from the eye, treat eye infection with tetracycline eye ointment","If mouth ulcers, treat with gentian violet","Follow-up in 2 days."};
        lstfever5 = new List("MEASLES WITH EYE OR MOUTH COMPLICATIONS'", List.IMPLICIT, feverDiagnosis5, null);
        lstfever5.addCommand(cmdBack);
        lstfever5.addCommand(cmdNext);
        lstfever5.setCommandListener(this);
        
        String feverDiagnosis6[] = new String[]{"Give Vitamin A treatment"};
        lstfever6 = new List("MEASLES", List.IMPLICIT, feverDiagnosis6, null);
        lstfever6.addCommand(cmdBack);
        lstfever6.addCommand(cmdNext);
        lstfever6.setCommandListener(this);
        

        //Warning Alert        
        alertWarning = new Alert("warning");
        alertWarning.setTitle("Warning");
        alertWarning.setString("\nThis child needs URGENT attention, complete the assesment and any pre-referal treatment immediately so that the referall is not delayed.");
        alertWarning.setType(AlertType.INFO);
        alertWarning.setTimeout(Alert.FOREVER);
        alertWarning.addCommand(cmdOk);
        alertWarning.setCommandListener(this);
        
        //Home Form
        formHome = new Form("General Danger Signs");
        homeAsk = new ChoiceGroup("Ask", Choice.MULTIPLE);
            homeAsk.append("Is the child able to drink or breastfeed?", null);
            homeAsk.append("Does the child vomit everything?", null);
            homeAsk.append("Has the child had convulsions?", null);
            homeAsk.setFitPolicy(Choice.TEXT_WRAP_DEFAULT);
            homeAsk.setSelectedFlags(new boolean[]{false, false, false});
            homeAsk.setPreferredSize(-1, -1);
        homeLook = new ChoiceGroup("Look", Choice.MULTIPLE);
            homeLook.append("See if the child is lethergic or unconscious.", null);
            homeLook.append("Is the child convulsing now?", null);
            homeLook.setSelectedFlags(new boolean[]{false, false});
        
        formHome.append(homeAsk); 
        formHome.append(homeLook);
        formHome.addCommand(cmdNext);
        formHome.addCommand(cmdExit);
        formHome.addCommand(cmdBack);
        formHome.setCommandListener(this);
        
        //Main Symptoms Form
        formMainSymptoms = new Form("Main Symptoms");
        main_symptoms = new StringItem("", "Does the child have a cough or difficulty breathing? ");
            main_symptoms.setLayout(ImageItem.LAYOUT_DEFAULT | ImageItem.LAYOUT_NEWLINE_BEFORE);
        formMainSymptoms.append(main_symptoms);
        formMainSymptoms.addCommand(cmdYes);
        formMainSymptoms.addCommand(cmdNo);
        formMainSymptoms.setCommandListener(this);
        
        //Diarrhoea Form
        formDiarrhoea = new Form("Diarrhoea");
        diarrhoea = new StringItem("", "Does the child have diarrhoea? ");
            diarrhoea.setLayout(ImageItem.LAYOUT_DEFAULT | ImageItem.LAYOUT_NEWLINE_BEFORE);
        formDiarrhoea.append(diarrhoea);
        formDiarrhoea.addCommand(cmdYes);
        formDiarrhoea.addCommand(cmdNo);
        formDiarrhoea.setCommandListener(this);
        
        //Fever Form
        formFever = new Form("Fever");
        fever = new StringItem("", "Does the child have a fever? ");
            fever.setLayout(ImageItem.LAYOUT_DEFAULT | ImageItem.LAYOUT_NEWLINE_BEFORE);
        formFever.append(fever);
        formFever.addCommand(cmdYes);
        formFever.addCommand(cmdNo);
        formFever.setCommandListener(this);
        
        
        //Breathing Form
        formBreathing = new Form("Breathing");
        age = new ChoiceGroup("How old is the child?", Choice.EXCLUSIVE);
            age.append("2 - 12 months", null);
            age.append("12 months - 5 years", null);
            age.setSelectedFlags(new boolean[]{false, false});
        breaths = new TextField("Breaths in one minute?", "", 32, TextField.ANY);
        breathingSymptoms = new ChoiceGroup("Breathing Symptoms", Choice.MULTIPLE);
            breathingSymptoms.append("Chest indrawing", null);
            breathingSymptoms.append("Stidor", null);
            breathingSymptoms.append("Wheezing", null);
            breathingSymptoms.setSelectedFlags(new boolean[]{false, false, false});
            
        formBreathing.append(age);
        formBreathing.append(breaths);
        formBreathing.append(breathingSymptoms);
        formBreathing.addCommand(cmdNext);
        formBreathing.addCommand(cmdBack);
        formBreathing.setCommandListener(this);
        
        //Diarrhoea Diagnose Form
        formDiarrhoeaDiagnose  = new Form("Diarrhoea Diagnosis");        
        d_days = new TextField("How many days has the diarrhoea been going on for?", "1", 32, TextField.ANY);
        diarrhoeaAsk = new ChoiceGroup("ASK", Choice.MULTIPLE);
            diarrhoeaAsk.append("Is there blood in the stool", null);
            diarrhoeaAsk.setSelectedFlags(new boolean[]{false,false});
        diarrhoeaLook = new ChoiceGroup("LOOK", Choice.MULTIPLE);
            diarrhoeaLook.append(" Are the eyes sunken?", null);
        diarrhoeaLook1 = new ChoiceGroup("General condition, how is the child?", Choice.EXCLUSIVE);
            diarrhoeaLook1.append("Lethargic or unconscious", null);
            diarrhoeaLook1.append("Restless and irritable", null);
            diarrhoeaLook1.append("none", null);
            diarrhoeaLook1.setSelectedFlags(new boolean[]{false, false,true});
        diarrhoeaLook2 = new ChoiceGroup("When offered fluids, the child is?", Choice.EXCLUSIVE);
            diarrhoeaLook2.append("Not able to drink or drinking poorly", null);
            diarrhoeaLook2.append("Drinking eagerly, thirsty", null);
            diarrhoeaLook2.append("none", null);
            diarrhoeaLook2.setSelectedFlags(new boolean[]{false, false, true});
        diarrhoeaLook3 = new ChoiceGroup("When the skin of the abdomen is pinched, it goes back?", Choice.EXCLUSIVE);
            diarrhoeaLook3.append("Very slowly,2 sec or more", null);
            diarrhoeaLook3.append("Slowly", null);
            diarrhoeaLook3.setSelectedFlags(new boolean[]{false, false});
        
        formDiarrhoeaDiagnose .append(d_days);   
        formDiarrhoeaDiagnose .append(diarrhoeaAsk);
        formDiarrhoeaDiagnose .append(diarrhoeaLook);
        formDiarrhoeaDiagnose .append(diarrhoeaLook1);
        formDiarrhoeaDiagnose .append(diarrhoeaLook2);
        formDiarrhoeaDiagnose .append(diarrhoeaLook3);
        formDiarrhoeaDiagnose .addCommand(cmdNext);
        formDiarrhoeaDiagnose .addCommand(cmdBack);
        formDiarrhoeaDiagnose .setCommandListener(this);
              
        //Fever Diagnose Form
        formFeverDiagnose = new Form("Fever ");
        ask = new StringItem("ASK", "");
            ask.setLayout(ImageItem.LAYOUT_DEFAULT | ImageItem.LAYOUT_NEWLINE_BEFORE);
        f_days = new TextField("How many days has the fever been going on for?", "1", 32, TextField.ANY);
        feverAsk = new ChoiceGroup("", Choice.MULTIPLE);
            feverAsk.append("Has the fever been present every day ?", null);
            feverAsk.append("Has the child had measles within the last 3 months ?", null);
            feverAsk.setFitPolicy(Choice.TEXT_WRAP_DEFAULT);
            feverAsk.setSelectedFlags(new boolean[]{false, false, false});
            feverAsk.setPreferredSize(-1, -1);
        feverLook = new ChoiceGroup("LOOK AND FEEL", Choice.MULTIPLE);
            feverLook.append("Does the child feel hot or have temperature of 37.5C or above?", null);
            feverLook.append("Does the child have a stiff neck?", null);
            feverLook.append("Does the child have a runny nose?", null);
            feverLook.append("Are there signs of measles?", null);
            feverLook.append("Is there a generalized rash?", null);
            feverLook.append("Does the child have a cough, runny nose or red eyes?", null);
            feverLook.append("Is there pus draining from the eye?", null);
            feverLook.append("Is there clouding in the cornea?", null);
            feverLook.setSelectedFlags(new boolean[]{false,false, false,false,false,false, false,false});
        feverUlcers = new ChoiceGroup("What kind of Mouth ulcers are there?", Choice.EXCLUSIVE);
            feverUlcers.append("none", null);
            feverUlcers.append("normal", null);
            feverUlcers.append("deep and extensive", null);
            feverUlcers.setSelectedFlags(new boolean[]{false, false,false});
        formFeverDiagnose.append(ask);   
        formFeverDiagnose.append(f_days);     
        formFeverDiagnose.append(feverAsk); 
        formFeverDiagnose.append(feverLook);
        formFeverDiagnose.append(feverUlcers);
        formFeverDiagnose.addCommand(cmdNext);     
        formFeverDiagnose.addCommand(cmdBack);
        formFeverDiagnose.setCommandListener(this);
        
        //Main Symptoms Form
        formEnd = new Form("END");
        end_msg = new StringItem("", "\n Thank You for using this application ");
            end_msg.setLayout(ImageItem.LAYOUT_DEFAULT | ImageItem.LAYOUT_NEWLINE_BEFORE);
        formEnd .append(end_msg);
        formEnd .addCommand(cmdExit);
        formEnd .setCommandListener(this);
  
        display = Display.getDisplay(this);
    }
    
    public void startApp() {
        display.setCurrent(formHome);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
    
    public void commandAction(Command c, Displayable d) {
        if (c == cmdExit) {
            destroyApp(true);
            notifyDestroyed();
        } else if (c == cmdNext && d == formHome) {
            //check if checkboxes have been ticked
            if((homeAsk.isSelected(0))||(homeAsk.isSelected(1))||(homeAsk.isSelected(2))||(homeLook.isSelected(0))||(homeLook.isSelected(1))){
                display.setCurrent(alertWarning);
            } else {
                display.setCurrent(formMainSymptoms);
            }       
        } else if (c == cmdOk && d ==alertWarning){
            display.setCurrent(formMainSymptoms);
        } else if (c == cmdYes && d==formMainSymptoms){
            display.setCurrent(formBreathing);
        } else if (c == cmdNo && d==formMainSymptoms){
            display.setCurrent(formDiarrhoea);
        } else if(c==cmdNext && d== formBreathing){
                String text = breaths.getString(); 
                int breath_check = Integer.parseInt(text); 
                if((age.isSelected(0))&&(breath_check>=50)){
                    if((breathingSymptoms.isSelected(0))||(breathingSymptoms.isSelected(1))||(breathingSymptoms.isSelected(2))){
                        display.setCurrent(lstMain1);              
                    }else{
                        display.setCurrent(lstMain2);
                    }
                }else if((age.isSelected(1))&&(breath_check>=40)){
                    if((breathingSymptoms.isSelected(0))||(breathingSymptoms.isSelected(1))||(breathingSymptoms.isSelected(2))){
                        display.setCurrent(lstMain1);              
                    }else{
                        display.setCurrent(lstMain2);
                    }
                }else{
                    display.setCurrent(lstMain3);
                }
            
        } else if(c==cmdNext && (d==lstMain1)||(d==lstMain2)||(d==lstMain3)){
            display.setCurrent(formDiarrhoea);
        } else if (c == cmdYes && d==formDiarrhoea) {
            display.setCurrent(formDiarrhoeaDiagnose);
        }else if (c == cmdNo && d==formDiarrhoea){
            display.setCurrent(formFever);
        } else if (c==cmdNext && d==formDiarrhoeaDiagnose){
            String text = d_days.getString(); 
            int days_check = Integer.parseInt(text); 
            if((diarrhoeaLook.isSelected(0))||(diarrhoeaLook1.isSelected(0))){ 
                if((diarrhoeaLook2.isSelected(0))||(diarrhoeaLook3.isSelected(0))){
                display.setCurrent(lstdiarrohoea1);
                }else if((diarrhoeaLook.isSelected(0))||(diarrhoeaLook1.isSelected(0))){
                display.setCurrent(lstdiarrohoea1);
                }
            }else if ((diarrhoeaLook.isSelected(0))||(diarrhoeaLook1.isSelected(1))){
               if((diarrhoeaLook2.isSelected(1))||(diarrhoeaLook3.isSelected(1))){
                display.setCurrent(lstdiarrohoea2);
                }else if((diarrhoeaLook.isSelected(0))||(diarrhoeaLook1.isSelected(1))){
                display.setCurrent(lstdiarrohoea2);
                }
            }else if ((days_check>=14)&&((!diarrhoeaLook.isSelected(0))||(!diarrhoeaLook1.isSelected(0))||(!diarrhoeaLook2.isSelected(0))||(!diarrhoeaLook3.isSelected(0)))){              
                display.setCurrent(lstdiarrohoea4);
            }else if((days_check>1)&&((!diarrhoeaLook.isSelected(0))||(!diarrhoeaLook1.isSelected(0))||(!diarrhoeaLook2.isSelected(0))||(!diarrhoeaLook3.isSelected(0)))){
                display.setCurrent(lstdiarrohoea5);
            }else if ((diarrhoeaAsk.isSelected(0))&&((days_check==1)||(!diarrhoeaLook.isSelected(0))||(!diarrhoeaLook1.isSelected(0))||(!diarrhoeaLook2.isSelected(0))||(!diarrhoeaLook3.isSelected(0)))) {
                display.setCurrent(lstdiarrohoea6);
            }else{
                 display.setCurrent(lstdiarrohoea3);
            }
        
        }else if ((c==cmdNext) && ((d==lstdiarrohoea1)||(d==lstdiarrohoea2)||(d==lstdiarrohoea3)||(d==lstdiarrohoea4)||(d==lstdiarrohoea5)||(d==lstdiarrohoea6))){
            display.setCurrent(formFever);
        } else if (c == cmdYes && d==formFever) {
            display.setCurrent(formFeverDiagnose);
        }else if (c==cmdNext && d==formFeverDiagnose){
            String text = f_days.getString(); 
            int fever_check = Integer.parseInt(text);
			
            if(feverLook.isSelected(1)){ 
                display.setCurrent(lstfever1);
            }else if ((feverLook.isSelected(0))||(feverLook.isSelected(4))){
                display.setCurrent(lstfever2);
            }else if ((feverAsk.isSelected(1))||(feverLook.isSelected(2))||(feverLook.isSelected(3))||(feverLook.isSelected(5))){
                display.setCurrent(lstfever3);
            }else if ((feverLook.isSelected(3))||(feverAsk.isSelected(1))){
				
                if((feverLook.isSelected(7))&&(feverUlcers.isSelected(2))){
                    display.setCurrent(lstfever4);
                }else if((feverLook.isSelected(6))&&(feverUlcers.isSelected(1))){
                    display.setCurrent(lstfever5);
                }else{
                    display.setCurrent(lstfever6);
                }
            }
  
        }else if ((c==cmdNext) && ((d==lstfever1)||(d==lstfever2)||(d==lstfever3)||(d==lstfever4)||(d==lstfever5)||(d==lstfever6))){
            display.setCurrent(formEnd);
        } else if (c == cmdNo && d==formFever){
            display.setCurrent(formEnd);
        }
    }
}
