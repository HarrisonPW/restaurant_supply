(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-2d22a198"],{dfee:function(e,r,a){"use strict";a.r(r);var s=function(){var e=this,r=e._self._c;return r("el-card",{staticClass:"box-card"},[r("el-form",{ref:"dataForm",attrs:{model:e.param,rules:e.rule,"label-width":"80px"}},[r("el-form-item",{attrs:{label:"username",prop:"username"}},[r("el-input",{attrs:{placeholder:"username"},model:{value:e.param.username,callback:function(r){e.$set(e.param,"username",r)},expression:"param.username"}})],1),r("el-form-item",{attrs:{label:"licenseid",prop:"licenseid"}},[r("el-input",{attrs:{placeholder:"licenseid"},model:{value:e.param.licenseid,callback:function(r){e.$set(e.param,"licenseid",r)},expression:"param.licenseid"}})],1),r("el-form-item",{attrs:{label:"experience",prop:"experience"}},[r("el-input",{attrs:{type:"number",placeholder:"experience"},model:{value:e.param.experience,callback:function(r){e.$set(e.param,"experience",r)},expression:"param.experience"}})],1),r("el-form-item",[r("el-button",{attrs:{type:"primary"},on:{click:e.onSubmit}},[e._v("confirm")])],1)],1)],1)},i=[],l={data(){return{param:{username:"",licenseid:"",experience:""},rule:{username:[{required:!0,message:"please fill in username",trigger:"blur"}],licenseid:[{required:!0,message:"please fill in licenseid",trigger:"blur"},{pattern:/^\d{6}$/,message:"it needs to be 6 digits",trigger:"blur"}],experience:[{required:!0,message:"please fill in experience",trigger:"blur"}]}}},methods:{onSubmit(){this.$refs.dataForm.validate(e=>{e&&this.$axios.post("/pilots/create",this.param).then(e=>{e.success?(this.$message({message:"successfully added",type:"success"}),this.$router.back()):this.$message.error(e.message)})})}}},t=l,n=a("2877"),p=Object(n["a"])(t,s,i,!1,null,"2e79af95",null);r["default"]=p.exports}}]);
//# sourceMappingURL=chunk-2d22a198.1c95b740.js.map