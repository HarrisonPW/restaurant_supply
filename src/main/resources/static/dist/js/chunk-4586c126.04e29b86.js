(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-4586c126"],{"0dc3":function(e,t,a){},"4dab":function(e,t,a){"use strict";a.r(t);a("14d9");var r=function(){var e=this,t=e._self._c;return t("el-card",{staticClass:"box-card"},[t("el-button",{attrs:{type:"primary"},on:{click:function(t){return e.$router.push("/admin/main/employee/add-worker")}}},[e._v("Add Worker")]),t("el-form",{staticClass:"demo-form-inline",attrs:{inline:!0}},[t("el-form-item",{attrs:{label:"username"}},[t("el-input",{attrs:{placeholder:"username"},model:{value:e.param.username,callback:function(t){e.$set(e.param,"username",t)},expression:"param.username"}})],1),t("el-form-item",[t("el-button",{attrs:{type:"primary"},on:{click:e.searchForm}},[e._v("Query")])],1)],1),t("el-table",{ref:"multipleTable",staticStyle:{width:"100%"},attrs:{border:"",data:e.tableList,"tooltip-effect":"dark"}},[t("el-table-column",{attrs:{align:"center",label:"username",prop:"username",sortable:""}})],1),t("el-pagination",{attrs:{background:"",layout:"prev, pager, next",total:e.total},on:{"current-change":e.changePage}})],1)},s=[],n={data(){return{param:{username:""},tableList:[],pageInfo:{pageNum:1,pageSize:10},total:0}},mounted(){this.getTableList(this.pageInfo)},methods:{getTableList(){this.$axios.post("/workers/findAll",Object.assign(this.param,this.pageInfo)).then(e=>{this.tableList=e.data.rows,this.total=e.data.count})},searchForm(){this.pageInfo.pageNum=1,this.getTableList()},changePage(e){this.pageInfo.pageNum=e,this.getTableList()}}},l=n,i=(a("f698"),a("2877")),o=Object(i["a"])(l,r,s,!1,null,"4a3799ca",null);t["default"]=o.exports},f698:function(e,t,a){"use strict";a("0dc3")}}]);
//# sourceMappingURL=chunk-4586c126.04e29b86.js.map