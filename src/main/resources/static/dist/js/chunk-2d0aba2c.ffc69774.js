(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-2d0aba2c"],{"15b4":function(e,a,r){"use strict";r.r(a);var t=function(){var e=this,a=e._self._c;return a("el-card",{staticClass:"box-card"},[a("el-form",{ref:"dataForm",attrs:{model:e.param,rules:e.rule,"label-width":"80px"}},[a("el-form-item",{attrs:{label:"longName",prop:"longName"}},[a("el-input",{attrs:{placeholder:"longName"},model:{value:e.param.longName,callback:function(a){e.$set(e.param,"longName",a)},expression:"param.longName"}})],1),a("el-form-item",{attrs:{label:"id",prop:"id"}},[a("el-input",{attrs:{placeholder:"id"},model:{value:e.param.id,callback:function(a){e.$set(e.param,"id",a)},expression:"param.id"}})],1),a("el-form-item",{attrs:{label:"tag",prop:"tag"}},[a("el-input",{attrs:{type:"number",placeholder:"tag"},model:{value:e.param.tag,callback:function(a){e.$set(e.param,"tag",a)},expression:"param.tag"}})],1),a("el-form-item",{attrs:{label:"barcode",prop:"barcode"}},[a("el-input",{attrs:{placeholder:"barcode"},model:{value:e.param.barcode,callback:function(a){e.$set(e.param,"barcode",a)},expression:"param.barcode"}})],1),a("el-form-item",{attrs:{label:"quantity",prop:"quantity"}},[a("el-input",{attrs:{type:"number",placeholder:"quantity"},model:{value:e.param.quantity,callback:function(a){e.$set(e.param,"quantity",a)},expression:"param.quantity"}})],1),a("el-form-item",[a("el-button",{attrs:{type:"primary"},on:{click:e.onSubmit}},[e._v("confirm")])],1)],1)],1)},l=[],s={data(){return{param:{longName:"",id:"",tag:"",barcode:"",quantity:""},rule:{longName:[{required:!0,message:"please fill in longName",trigger:"blur"}],id:[{required:!0,message:"please fill in id",trigger:"blur"}],tag:[{required:!0,message:"please fill in tag",trigger:"blur"}],barcode:[{required:!0,message:"please fill in barcode",trigger:"blur"}],quantity:[{required:!0,message:"please fill in quantity",trigger:"blur"}]}}},methods:{onSubmit(){this.$refs.dataForm.validate(e=>{e&&this.$axios.post("/restaurants/purchase-ingredient",this.param).then(e=>{e.success?(this.$message({message:"operate successfully",type:"success"}),this.$router.back()):this.$message.error(e.message)})})}}},i=s,o=r("2877"),n=Object(o["a"])(i,t,l,!1,null,"7c6edb87",null);a["default"]=n.exports}}]);
//# sourceMappingURL=chunk-2d0aba2c.ffc69774.js.map