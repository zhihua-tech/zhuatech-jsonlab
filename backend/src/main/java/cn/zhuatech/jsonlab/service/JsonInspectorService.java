/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.jsonlab.service;
import tools.jackson.databind.*;import jakarta.validation.constraints.*;import org.springframework.stereotype.Service;import java.nio.charset.StandardCharsets;import java.security.*;import java.util.HexFormat;
/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@Service public class JsonInspectorService{private final ObjectMapper mapper;/**
                                                                              * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                              */
public JsonInspectorService(ObjectMapper mapper){this.mapper=mapper;}
 /**
  * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
  */
 public Result inspect(Request r){try{JsonNode root=mapper.readTree(r.content());String normalized=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(root);return new Result(true,root.getNodeType().name(),count(root),depth(root),normalized,sha256(normalized),null);}catch(Exception e){return new Result(false,"INVALID",0,0,null,null,e.getMessage());}}
 /**
  * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
  */
 private int count(JsonNode n){int total=1;for(JsonNode child:n)total+=count(child);return total;}/**
                                                                                                   * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                   */
private int depth(JsonNode n){int max=0;for(JsonNode child:n)max=Math.max(max,depth(child));return 1+max;}/**
                                                                                                                                                                                                             * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                                                                             */
private String sha256(String v)throws NoSuchAlgorithmException{return HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256").digest(v.getBytes(StandardCharsets.UTF_8)));}
 /**
  * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
  */
 public record Request(@NotBlank @Size(max=500000) String content){}/**
                                                                     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                     */
public record Result(boolean valid,String rootType,int nodeCount,int maxDepth,String normalized,String fingerprint,String error){} }
