(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-2d0e24d2"],{"7db1":function(e,a,r){"use strict";r.r(a);var l=function(){var e=this,a=e._self._c;return a("el-card",{staticClass:"box-card"},[a("el-form",{ref:"dataForm",attrs:{model:e.param,rules:e.rule,"label-width":"80px"}},[a("el-form-item",{attrs:{label:"id",prop:"id"}},[a("el-input",{attrs:{placeholder:"id"},model:{value:e.param.id,callback:function(a){e.$set(e.param,"id",a)},expression:"param.id"}})],1),a("el-form-item",{attrs:{label:"longName",prop:"longName"}},[a("el-input",{attrs:{placeholder:"longName"},model:{value:e.param.longName,callback:function(a){e.$set(e.param,"longName",a)},expression:"param.longName"}})],1),a("el-form-item",{attrs:{label:"homeBase",prop:"homeBase"}},[a("el-input",{attrs:{placeholder:"homeBase"},model:{value:e.param.homeBase,callback:function(a){e.$set(e.param,"homeBase",a)},expression:"param.homeBase"}})],1),a("el-form-item",{attrs:{label:"manager",prop:"manager"}},[a("el-input",{attrs:{placeholder:"manager"},model:{value:e.param.manager,callback:function(a){e.$set(e.param,"manager",a)},expression:"param.manager"}})],1),a("el-form-item",[a("el-button",{attrs:{type:"primary"},on:{click:e.onSubmit}},[e._v("confirm")])],1)],1)],1)},s=[],t={data(){return{param:{id:"",longName:"",homeBase:"",manager:""},rule:{id:[{required:!0,message:"please fill in id",trigger:"blur"}],longName:[{required:!0,message:"please fill in longName",trigger:"blur"}],homeBase:[{required:!0,message:"please fill in homeBase",trigger:"blur"}],manager:[{required:!0,message:"please fill in manager",trigger:"blur"}]}}},methods:{onSubmit(){this.$refs.dataForm.validate(e=>{e&&this.$axios.post("/deliveryServices/create",this.param).then(e=>{e.success?(this.$message({message:"successfully added",type:"success"}),this.$router.back()):this.$message.error(e.message)})})}}},m=t,i=r("2877"),o=Object(i["a"])(m,l,s,!1,null,"564c41bc",null);a["default"]=o.exports}}]);
//# sourceMappingURL=chunk-2d0e24d2.dca27d08.js.map