/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt.chuong05.donglenh;

import hdt.chuong05.logic.FileAndDrectoryOperation;
import java.io.File;

/**
 *
 * @author OS
 */
public class testFileandDirectory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileAndDrectoryOperation fo = new FileAndDrectoryOperation();
        // File[] content=fo.getDirectoryContent("D:\\Project_MVC\\Publics\\Image");
        // System.out.println(fo.displayContent(content));

//       File[] thumuc=fo.getSubDirecttories(content);
//       System.out.println("danh sách các thư mục con là:");
//        System.out.println(fo.displayContent(thumuc));
//    
//        File[] teptin=fo.getFiles(content);
//       System.out.println("danh sách các tệp tin là:");
//        System.out.println(fo.displayContent(teptin));
// 
        fo.getContentRecursively("D:\\Img");
    }
    
}
