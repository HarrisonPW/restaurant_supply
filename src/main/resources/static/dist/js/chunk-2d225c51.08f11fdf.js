(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-2d225c51"],{e68b:function(e,a,t){"use strict";t.r(a);var r=function(){var e=this,a=e._self._c;return a("el-card",{staticClass:"box-card"},[a("el-form",{ref:"dataForm",attrs:{model:e.param,rules:e.rule,"label-width":"80px"}},[a("el-form-item",{attrs:{label:"longName",prop:"longName"}},[a("el-input",{attrs:{placeholder:"longName"},model:{value:e.param.longName,callback:function(a){e.$set(e.param,"longName",a)},expression:"param.longName"}})],1),a("el-form-item",{attrs:{label:"rating",prop:"rating"}},[a("el-input",{attrs:{type:"number",placeholder:"rating"},model:{value:e.param.rating,callback:function(a){e.$set(e.param,"rating",a)},expression:"param.rating"}})],1),a("el-form-item",{attrs:{label:"spent",prop:"spent"}},[a("el-input",{attrs:{type:"number",placeholder:"spent"},model:{value:e.param.spent,callback:function(a){e.$set(e.param,"spent",a)},expression:"param.spent"}})],1),a("el-form-item",{attrs:{label:"location",prop:"location"}},[a("el-input",{attrs:{placeholder:"location"},model:{value:e.param.location,callback:function(a){e.$set(e.param,"location",a)},expression:"param.location"}})],1),a("el-form-item",[a("el-button",{attrs:{type:"primary"},on:{click:e.onSubmit}},[e._v("confirm")])],1)],1)],1)},l=[],s={data(){return{param:{longName:"",rating:"",spent:"",location:""},rule:{longName:[{required:!0,message:"please fill in longName",trigger:"blur"}],rating:[{required:!0,message:"please fill in rating",trigger:"blur"}],spent:[{required:!0,message:"please fill in spent",trigger:"blur"}],location:[{required:!0,message:"please fill in location",trigger:"blur"}]}}},methods:{onSubmit(){this.$refs.dataForm.validate(e=>{e&&this.$axios.post("/restaurants/create",this.param).then(e=>{e.success?(this.$message({message:"successfully added",type:"success"}),this.$router.back()):this.$message.error(e.message)})})}}},n=s,o=t("2877"),i=Object(o["a"])(n,r,l,!1,null,"749cf737",null);a["default"]=i.exports}}]);
//# sourceMappingURL=chunk-2d225c51.08f11fdf.js.map