/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt.chuong05.logic;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author OS
 */
public class TreeDemoModel implements TreeModel {
    
    DefaultTreeModel tree;
    DefaultMutableTreeNode rootNodel;
    
    public TreeDemoModel() {
        rootNodel = buildTree("carMotor");
        tree = new DefaultTreeModel(rootNodel);
    }
    
    private DefaultMutableTreeNode buildTree(String rootName) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(rootName);
        
        DefaultMutableTreeNode car = new DefaultMutableTreeNode("Car");
        DefaultMutableTreeNode motor = new DefaultMutableTreeNode("Motor");
        
        root.add(car);
        root.add(motor);
        
        DefaultMutableTreeNode honda = new DefaultMutableTreeNode("Honda");
        DefaultMutableTreeNode maxda = new DefaultMutableTreeNode("Maxda");
        DefaultMutableTreeNode toyota = new DefaultMutableTreeNode("Toyota");
        
        car.add(honda);
        car.add(toyota);
        car.add(maxda);
        
        DefaultMutableTreeNode suruki = new DefaultMutableTreeNode("Suruki");
        DefaultMutableTreeNode yamaha = new DefaultMutableTreeNode("Yamaha");
        
        motor.add(yamaha);
        motor.add(suruki);
        
        return root;
    }

    public DefaultTreeModel getTree() {
        return tree;
    }

    public void setTree(DefaultTreeModel tree) {
        this.tree = tree;
    }

    public DefaultMutableTreeNode getRootNodel() {
        return rootNodel;
    }

    public void setRootNodel(DefaultMutableTreeNode rootNodel) {
        this.rootNodel = rootNodel;
    }
    
    
    
    @Override
    public Object getRoot() {
        return this.rootNodel;
    }
    
    @Override
    public Object getChild(Object parent, int index) {
        return tree.getChild(parent, index);
    }
    
    @Override
    public int getChildCount(Object parent) {
        return tree.getChildCount(parent);
    }
    
    @Override
    public boolean isLeaf(Object node) {
        return tree.isLeaf(node);
    }
    
    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {
        tree.valueForPathChanged(path, newValue);
    }
    
    @Override
    public int getIndexOfChild(Object parent, Object child) {
        return tree.getIndexOfChild(parent, child);
        
    }
    
    @Override
    public void addTreeModelListener(TreeModelListener l) {
        
        tree.addTreeModelListener(l);
    }
    
    @Override
    public void removeTreeModelListener(TreeModelListener l) {
        tree.removeTreeModelListener(l);
    }
    
}
