package cis350;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class StoicPane extends JPanel{
	
	private Boolean mode;
	
	private JScrollPane inputPanel;
	
	private JScrollPane outputPanel;
	
	private JList inputList;
	
	private JList outputList;
	
	private DefaultListModel<MathCalc> inputModel;
	
	private DefaultListModel<MathCalc> outputModel;
	
	private JLabel inputLabel;
	
	private JLabel outputLabel;
	
	private MathCalc input1, input2, input3, input4, input5;
	
	private MathCalc output1, output2, output3, output4, output5; 
	
	public StoicPane(){
		this.setLayout(new GridBagLayout());
		inputModel = new DefaultListModel<MathCalc>();
		mode = true;
		
		input1 = new MathCalc();
		inputModel.addElement(input1);
		
		input2 = new MathCalc();
		inputModel.addElement(input2);
		
		input3 = new MathCalc();
		inputModel.addElement(input3);
		
		input4 = new MathCalc();
		inputModel.addElement(input4);
		
		input5 = new MathCalc();
		inputModel.addElement(input5);
		
		inputList = new JList(inputModel);
		inputList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		inputList.setVisibleRowCount(5);
		inputPanel = new JScrollPane(inputList);
		Dimension d = new Dimension(210,95);
		inputList.setPreferredSize(d);
				
		outputModel = new DefaultListModel<MathCalc>();
		outputList = new JList(outputModel);
		outputList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		outputList.setVisibleRowCount(5);
		outputPanel = new JScrollPane(outputList);
		outputPanel.setPreferredSize(d);
		
		output1 = new MathCalc();
		outputModel.addElement(output1);
		
		output2 = new MathCalc();
		outputModel.addElement(output2);
		
		output3 = new MathCalc();
		outputModel.addElement(output3);
		
		output4 = new MathCalc();
		outputModel.addElement(output4);
		
		output5 = new MathCalc();
		outputModel.addElement(output5);
		
		inputLabel = new JLabel("Input Molecules");
		outputLabel = new JLabel("Output Molecules");
		
		GridBagConstraints loc = new GridBagConstraints();
		loc.gridx = 0;
		loc.gridy = 1;
		
		add(inputPanel, loc);
		
		loc.gridx = 1;

		add(outputPanel, loc);
		
		loc.gridy = 0;
		
		add(outputLabel, loc);
		
		loc.gridx = 0;
		
		add(inputLabel, loc);
		
		setVisible(true);
		
	}
	
	public void addToSelectedInput(Elements element){
		MathCalc temp = (MathCalc)inputList.getSelectedValue();
		temp.addElement(element);
	}
	
	public void addToSelectedOutput(Elements element){
		MathCalc temp = (MathCalc)outputList.getSelectedValue();
		temp.addElement(element);
	}
	
	public void removeFromSelectedInput(Elements element){
		MathCalc temp = (MathCalc)inputList.getSelectedValue();
		temp.removeElement(element);
	}
	
	public void removeFromSelectedOutput(Elements element){
		MathCalc temp = (MathCalc)outputList.getSelectedValue();
		temp.removeElement(element);
	}
	
	public void clearSelectedInput(){
		MathCalc temp = (MathCalc)inputList.getSelectedValue();
		temp.clearList();
	}
	
	public void clearSelectedOutput(){
		MathCalc temp = (MathCalc)outputList.getSelectedValue();
		temp.clearList();
	}
	
	public void modeSwitch(){
		if (mode){
			mode = false;
		}else{
			mode = true;
		}
	}
	
	public Boolean getMode(){
		return mode;
	}
	
	public void enabler(){
		if (mode){
			inputList.setEnabled(true);
			outputList.setEnabled(false);
		}else{
			inputList.setEnabled(false);
			outputList.setEnabled(true);
		}
	}
}
