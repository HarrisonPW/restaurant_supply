(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-2d0d0f4b"],{"69d6":function(a,e,r){"use strict";r.r(e);var t=function(){var a=this,e=a._self._c;return e("el-card",{staticClass:"box-card"},[e("el-form",{ref:"dataForm",attrs:{model:a.param,rules:a.rule,"label-width":"150px"}},[e("el-form-item",{attrs:{label:"id",prop:"id"}},[e("el-input",{attrs:{placeholder:"id"},model:{value:a.param.id,callback:function(e){a.$set(a.param,"id",e)},expression:"param.id"}})],1),e("el-form-item",{attrs:{label:"tag",prop:"tag"}},[e("el-input",{attrs:{type:"number",placeholder:"tag"},model:{value:a.param.tag,callback:function(e){a.$set(a.param,"tag",e)},expression:"param.tag"}})],1),e("el-form-item",{attrs:{label:"swarm_leader_tag",prop:"swarmTag"}},[e("el-input",{attrs:{type:"number",placeholder:"swarm_leader_tag"},model:{value:a.param.swarmTag,callback:function(e){a.$set(a.param,"swarmTag",e)},expression:"param.swarmTag"}})],1),e("el-form-item",[e("el-button",{attrs:{type:"primary"},on:{click:a.onSubmit}},[a._v("confirm")])],1)],1)],1)},s=[],l={data(){return{param:{id:"",tag:"",swarmTag:""},rule:{id:[{required:!0,message:"please fill in id",trigger:"blur"}],tag:[{required:!0,message:"please fill in tag",trigger:"blur"}],swarmTag:[{required:!0,message:"please fill in swarm_leader_tag",trigger:"blur"}]}}},methods:{onSubmit(){this.$refs.dataForm.validate(a=>{a&&this.$axios.post("/drones/join-swarm",this.param).then(a=>{a.success?(this.$message({message:"operate successfully",type:"success"}),this.$router.back()):this.$message.error(a.message)})})}}},i=l,m=r("2877"),o=Object(m["a"])(i,t,s,!1,null,"71efc85d",null);e["default"]=o.exports}}]);
//# sourceMappingURL=chunk-2d0d0f4b.0cd5c18c.js.map