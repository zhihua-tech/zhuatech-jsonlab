/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.jsonlab.controller;import cn.zhuatech.jsonlab.service.JsonInspectorService;import jakarta.validation.Valid;import org.springframework.web.bind.annotation.*;
/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@RestController @RequestMapping("/api/jsonlab") @CrossOrigin public class JsonInspectorController{private final JsonInspectorService service;/**
                                                                                                                                              * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                              */
public JsonInspectorController(JsonInspectorService service){this.service=service;}/**
                                                                                                                                                                                                                                 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                                                                                                 */
@PostMapping("/inspect") JsonInspectorService.Result inspect(@Valid @RequestBody JsonInspectorService.Request r){return service.inspect(r);}}
