package com.example.controller;

import com.example.dto.AuthRequestDto;
import com.example.dto.AuthResponseDto;
import com.example.dto.ResponseDto;
import com.example.exception.BusinessErrorException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "/rest")
public class RestController {

    @GetMapping
    public List<ResponseDto> main(){
        List<ResponseDto> list = new ArrayList<ResponseDto>();
        list.add(new ResponseDto("1","ryohei"));
        list.add(new ResponseDto("2","kana"));
        return list;
    }

    @GetMapping(value="/v1")
    public ResponseDto getRest(){
        System.out.println("Server Response");
        return new ResponseDto("1","ディープインパクト");
    }

    @GetMapping(value="/v2")
    public List<ResponseDto> getRestList(){
        List<ResponseDto> result = new ArrayList<ResponseDto>();
        result.add(new ResponseDto("1","ディープインパクト"));
        result.add(new ResponseDto("2","キタサンブラック"));
        return result;
    }

    @PostMapping(value="/v1")
    @ResponseStatus(value= HttpStatus.CREATED)
    public AuthResponseDto post(@RequestBody AuthRequestDto dto) throws BusinessErrorException {
        //Class clazz = new Object(){}.getClass();
        //System.out.println(clazz.getEnclosingClass().getName() + " : " + clazz.getEnclosingMethod().getName());
        Integer no = Integer.parseInt(dto.getBranchNumber());
        if( no == 999 ) {
            return new AuthResponseDto("パスワードが一定回数誤りました。","HAW000999");
        }else if( no >= 900 ){
            throw new BusinessErrorException(dto.getBranchNumber());
        }
        return new AuthResponseDto(null,null);
    }

    @ExceptionHandler(value = BusinessErrorException.class)
    @ResponseStatus(value= HttpStatus.NOT_ACCEPTABLE)
    public AuthResponseDto error(BusinessErrorException ex){
        return new AuthResponseDto("不正な店番エラー(" + ex.getErrorInfo() +  ")","HAW000" + ex.getErrorInfo());
    }


}
