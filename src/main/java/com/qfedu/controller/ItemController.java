package com.qfedu.controller;



import com.qfedu.entity.Item;
import com.qfedu.service.ItemService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ItemController {

    @Autowired
    private ItemService service;

    @ApiOperation(notes = "id:登陆用户的id；",tags = {"订单的接口"},value = "用户登陆id")
    @PostMapping("deleteItem.do")
    @CrossOrigin
    private ResultVo deleteItem(@ApiParam(value = "201") Integer id) {
        if(service.deleteByPrimaryKey(id) == 0){
            return  ResultVo.setERROR();
        } else {
            return ResultVo.setOK(null);
        }
    }
    @ApiOperation(notes = "item:对象；",tags = {"订单的接口"},value = "当前item")
    @PostMapping("insert.do")
    @CrossOrigin
    private ResultVo insert(@ApiParam(value = "202") Item item){
        if(service.insert(item) == 0){
            return  ResultVo.setERROR();
        } else {
            return ResultVo.setOK(null);
        }
    }

    @ApiOperation(notes = "item:对象；",tags = {"订单的接口"},value = "当前item")
    @PostMapping("insertSelective.do")
    @CrossOrigin
    private ResultVo insertSelective(@ApiParam(value = "202") Item item){
        if(service.insertSelective(item) == 0){
            return  ResultVo.setERROR();
        } else {
            return ResultVo.setOK(null);
        }
    }

    @ApiOperation(notes = "id:登陆用户的id；",tags = {"订单的接口"},value = "用户登陆id")
    @PostMapping("selectByPrimaryKey.do")
    @CrossOrigin
    private ResultVo selectByPrimaryKey(@ApiParam(value = "202") Integer id){
        if(service.selectByPrimaryKey(id) == null){
            return  ResultVo.setERROR();
        } else {
            return ResultVo.setOK(null);
        }
    }

    @ApiOperation(notes = "item:对象；",tags = {"订单的接口"},value = "当前item")
    @PostMapping("updateByPrimaryKeySelective.do")
    @CrossOrigin
    private ResultVo updateByPrimaryKeySelective(@ApiParam(value = "202") Item item){
        if(service.updateByPrimaryKeySelective(item) == 0){
            return  ResultVo.setERROR();
        } else {
            return ResultVo.setOK(null);
        }
    }

    @ApiOperation(notes = "item:对象；",tags = {"订单的接口"},value = "当前item")
    @PostMapping("updateByPrimaryKey.do")
    @CrossOrigin
    private ResultVo updateByPrimaryKey(@ApiParam(value = "202") Item item){
        if(service.updateByPrimaryKey(item) == 0){
            return  ResultVo.setERROR();
        } else {
            return ResultVo.setOK(null);
        }
    }
}
