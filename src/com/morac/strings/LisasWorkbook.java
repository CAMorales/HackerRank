package com.morac.lisasworkbook;


import java.util.Scanner;

/**
 * Created by Claudio Morales on 7/04/16.
 */
public class LisasWorkbook {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int chapters=sc.nextInt();
        int maxPerPage=sc.nextInt();
        int special=0, page=0,probPerChapter;
        for(int i=0;i<chapters;i++){
            probPerChapter=sc.nextInt();
            page++;
            int problem=1;
            int probOnPage=1;
            while(problem<=probPerChapter && probOnPage<=maxPerPage){
                if(problem==page){
                    special++;
                }
                ++probOnPage;
                ++problem;
                if(problem<=probPerChapter && probOnPage>maxPerPage){
                    page++;
                    probOnPage=1;
                }
            }
        }
        System.out.println(special);
    }
}
