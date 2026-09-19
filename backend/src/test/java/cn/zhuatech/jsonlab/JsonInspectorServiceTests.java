/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.jsonlab;import cn.zhuatech.jsonlab.service.JsonInspectorService;import tools.jackson.databind.ObjectMapper;import org.junit.jupiter.api.Test;import static org.junit.jupiter.api.Assertions.*;
/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
class JsonInspectorServiceTests{private final JsonInspectorService s=new JsonInspectorService(new ObjectMapper());/**
                                                                                                                   * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                   */
@Test void inspectsValidObject(){var r=s.inspect(new JsonInspectorService.Request("{\"a\":[1,2]}"));assertTrue(r.valid());assertEquals("OBJECT",r.rootType());assertEquals(4,r.nodeCount());}/**
                                                                                                                                                                                                                                                                                                                * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                                                                                                                                                                                */
@Test void reportsInvalidJson(){assertFalse(s.inspect(new JsonInspectorService.Request("{bad" )).valid());}}
