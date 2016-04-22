package softwareproject.controller;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import softwareproject.model.Assessment;
import softwareproject.model.Module;

public class ListPopulator<T> {
    
    public void populateJList(ArrayList<T> src, JList jl){
        DefaultListModel<T> lm = new DefaultListModel();
        for(T o :src){
            lm.addElement(o);
        }
        jl.setModel(lm);
    }
    
    public void populateComboBox(ArrayList<T> src, JComboBox jcb){
        jcb.removeAllItems();
        for(T o : src){
            jcb.addItem(o);
        } 
        jcb.setSelectedIndex(0);
    }
}