(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-2d0bce23"],{"2a42":function(e,a,r){"use strict";r.r(a);var s=function(){var e=this,a=e._self._c;return a("el-card",{staticClass:"box-card"},[a("el-form",{ref:"dataForm",attrs:{model:e.param,rules:e.rule,"label-width":"80px"}},[a("el-form-item",{attrs:{label:"username",prop:"username"}},[a("el-input",{attrs:{placeholder:"username"},model:{value:e.param.username,callback:function(a){e.$set(e.param,"username",a)},expression:"param.username"}})],1),a("el-form-item",[a("el-button",{attrs:{type:"primary"},on:{click:e.onSubmit}},[e._v("confirm")])],1)],1)],1)},t=[],l={data(){return{param:{username:""},rule:{username:[{required:!0,message:"please fill in username",trigger:"blur"}]}}},methods:{onSubmit(){this.$refs.dataForm.validate(e=>{e&&this.$axios.post("/workers/create",this.param).then(e=>{e.success?(this.$message({message:"successfully added",type:"success"}),this.$router.back()):this.$message.error(e.message)})})}}},u=l,m=r("2877"),n=Object(m["a"])(u,s,t,!1,null,"8a65534a",null);a["default"]=n.exports}}]);
//# sourceMappingURL=chunk-2d0bce23.90d9165e.js.map