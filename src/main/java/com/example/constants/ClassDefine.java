package com.example.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public enum ClassDefine {

    CLASS1(1,"RyoheiClass"),
    CLASS2(2,"KanaClass")
    ;

    /**
     * 区分
     */
    private int kbn;

    /**
     * クラス名
     */
    private String className;

    public static String getClassName(int i){
        for(ClassDefine z : ClassDefine.values()){
            if( z.kbn == i ){
                return z.className;
            }
        }
        return "other";
    }
}
