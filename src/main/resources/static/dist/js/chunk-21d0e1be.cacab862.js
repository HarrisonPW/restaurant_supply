(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-21d0e1be"],{2548:function(e,t,a){"use strict";a.r(t);a("14d9");var n=function(){var e=this,t=e._self._c;return t("el-card",{staticClass:"box-card"},[t("el-button",{attrs:{type:"primary"},on:{click:function(t){return e.$router.push("/admin/main/delivery/add-ingredient")}}},[e._v("Add Ingredient")]),t("el-form",{staticClass:"demo-form-inline",attrs:{inline:!0}},[t("el-form-item",{attrs:{label:"barcode"}},[t("el-input",{attrs:{placeholder:"barcode"},model:{value:e.param.barcode,callback:function(t){e.$set(e.param,"barcode",t)},expression:"param.barcode"}})],1),t("el-form-item",{attrs:{label:"iname"}},[t("el-input",{attrs:{placeholder:"iname"},model:{value:e.param.iname,callback:function(t){e.$set(e.param,"iname",t)},expression:"param.iname"}})],1),t("el-form-item",{attrs:{label:"weight"}},[t("el-input",{attrs:{placeholder:"weight"},model:{value:e.param.weight,callback:function(t){e.$set(e.param,"weight",t)},expression:"param.weight"}})],1),t("el-form-item",[t("el-button",{attrs:{type:"primary"},on:{click:e.searchForm}},[e._v("Query")])],1)],1),t("el-table",{ref:"multipleTable",staticStyle:{width:"100%"},attrs:{border:"",data:e.tableList,"tooltip-effect":"dark"}},[t("el-table-column",{attrs:{align:"center",label:"barcode",prop:"barcode",sortable:""}}),t("el-table-column",{attrs:{align:"center",prop:"iname",label:"iname",sortable:""}}),t("el-table-column",{attrs:{align:"center",prop:"weight",label:"weight",sortable:""}}),t("el-table-column",{attrs:{align:"center",label:"operation"},scopedSlots:e._u([{key:"default",fn:function(a){return[t("el-button",{attrs:{type:"danger",size:"small"},on:{click:function(t){return e.handleDelete(a.row.barcode)}}},[e._v("Delete")])]}}])})],1),t("el-pagination",{attrs:{background:"",layout:"prev, pager, next",total:e.total},on:{"current-change":e.changePage}})],1)},l=[],r={data(){return{param:{barcode:"",iname:"",weight:""},tableList:[],pageInfo:{pageNum:1,pageSize:10},total:0}},mounted(){this.getTableList(this.pageInfo)},methods:{getTableList(){this.$axios.post("/ingredients/findAll",Object.assign(this.param,this.pageInfo)).then(e=>{this.tableList=e.data.rows,this.total=e.data.count})},searchForm(){this.pageInfo.pageNum=1,this.getTableList()},changePage(e){this.pageInfo.pageNum=e,this.getTableList()},handleDelete(e){this.$confirm("Are you sure to delete this ingredient?","Warning",{confirmButtonText:"OK",cancelButtonText:"Cancel",type:"warning"}).then(()=>{this.$axios.get("/ingredients/remove/"+e).then(()=>{this.$message({type:"success",message:"Delete successfully!"}),this.getTableList()})}).catch(()=>{this.$message({type:"info",message:"Delete canceled"})})}}},i=r,s=(a("ccb0"),a("2877")),o=Object(s["a"])(i,n,l,!1,null,"52b273aa",null);t["default"]=o.exports},ccb0:function(e,t,a){"use strict";a("d276")},d276:function(e,t,a){}}]);
//# sourceMappingURL=chunk-21d0e1be.cacab862.js.map