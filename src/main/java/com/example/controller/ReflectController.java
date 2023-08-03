package com.example.controller;

import com.example.constants.ClassDefine;
import com.example.reflect.ReflectionService2;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Controller
@AllArgsConstructor
public class ReflectController {

    @GetMapping(value="/reflect/{kbn}")
    public String show(@PathVariable String kbn, Model model) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {

        // 区分から実行したいクラス名を取得
        String className = ClassDefine.getClassName(Integer.parseInt(kbn));

        // 取得した名前からクラスをインスタンス化
        Class<?> clazz = Class.forName("com.example.reflect.impl." + className);
        Object obj = clazz.newInstance();

        // 取得したクラスのmethodを実行
        Method m = clazz.getMethod("getName");
        String name = (String) m.invoke(obj);

        // ==================================================

        // 引数ありmethod
        ReflectionService2 ref = new ReflectionService2("陽花");
        Class<?> clazz2 = ref.getClass();
        Method method2 = clazz2.getMethod("getFullName", String.class);
        String name2 = (String) method2.invoke(ref,"板村");

        // コンストラクタあり
        clazz = Class.forName("com.example.reflect.ReflectionService2");
        Constructor constructor = clazz.getConstructor(String.class);
        obj = constructor.newInstance("咲明");
        m = clazz.getMethod("getFullName",String.class);
        System.out.println(m.invoke(obj,"板村"));


        model.addAttribute("name",name);
        model.addAttribute("name2",name2);
        return "reflect/index";
    }
}
