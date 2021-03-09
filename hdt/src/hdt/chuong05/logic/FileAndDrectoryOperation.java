/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt.chuong05.logic;

import java.io.File;
import java.util.ArrayList;
import javax.swing.text.AbstractDocument;

/**
 *
 * @author OS
 */
public class FileAndDrectoryOperation {

    public FileAndDrectoryOperation() {
    }
    public File[] getDirectoryContent(String folder){
        File directory=new File(folder);
        if(directory.isFile())
            return null;
        File[] result=directory.listFiles();
        return result;
    }
    public String displayContent(File[] content){
        StringBuilder sd=new StringBuilder();
        for(int i=0;i<content.length;i++){
        sd.append(content[i].getPath()).append( File.separator).append(content[i].getName());
   sd.append("\n");
        }
        return sd.toString();
    }
    
    public File[] getSubDirecttories (File[] content){
        ArrayList<File> result=new ArrayList<>();
        for(int i=0;i<content.length;i++){
            if(content[i].isDirectory()){
                result.add(content[i]);
            }
        }
        File[] ketqua=new File[result.size()];
        return result.toArray(ketqua);
    }
    
    public File[] getFiles(File[] content){
        ArrayList<File> result=new ArrayList<>();
        for(int i=0;i<content.length;i++){
            if(content[i].isDirectory()){
                result.add(content[i]);
            }
        }
        File[] ketqua=new File[result.size()];
        return result.toArray(ketqua);
    }
    public void getContentRecursively(String folder){
        File content=new File(folder);
        
        if(content.isFile()){
            System.out.println(content.getPath()+File.separator+content.getName());
            return;
        }
        System.out.println("Thu muc: " +folder);
        File[] sub=content.listFiles();
        for(int i=0;i<sub.length;i++){
            getContentRecursively(folder +File.separator+sub[i].getName());
        }
    }
}
