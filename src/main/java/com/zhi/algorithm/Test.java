package com.zhi.algorithm;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        StringBuffer sbuffer = new StringBuffer();
        sbuffer.append("hello world");
        t.replaceSpace(sbuffer);
    }
    public String replaceSpace(StringBuffer str) {
        int oldlen=str.length();
        int blankCount=0;
        for(int i=0;i<oldlen;i++){//获得空格数量
            if(str.charAt(i)==' '){
                blankCount++;
            }
        }
        int newlen=oldlen+blankCount*2;
        str.setLength(newlen);
        //从后向前移动字符
        int indexnew = oldlen-1;
        int indexold = newlen-1;
        while(indexnew>=0&&indexold>=0){
            if(str.charAt(indexold)==' '){
                str.setCharAt(indexnew--,'0');
                str.setCharAt(indexnew--,'2');
                str.setCharAt(indexnew--,'%');
                indexold--;
            }else{
                str.setCharAt(indexnew,str.charAt(indexold));
                indexnew--;
                indexold--;
            }
        }
        return str.toString();
    }
}
