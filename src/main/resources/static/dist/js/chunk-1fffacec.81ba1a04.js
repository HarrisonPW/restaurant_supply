(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-1fffacec"],{"1de6":function(e,a,t){"use strict";t("f067")},e7b6:function(e,a,t){"use strict";t.r(a);var n=function(){var e=this,a=e._self._c;return a("el-card",{staticClass:"box-card"},[a("el-form",{staticClass:"demo-form-inline",attrs:{inline:!0}},[a("el-form-item",{attrs:{label:"username"}},[a("el-input",{attrs:{placeholder:"username"},model:{value:e.param.username,callback:function(a){e.$set(e.param,"username",a)},expression:"param.username"}})],1),a("el-form-item",{attrs:{label:"licenseid"}},[a("el-input",{attrs:{placeholder:"licenseid"},model:{value:e.param.licenseid,callback:function(a){e.$set(e.param,"licenseid",a)},expression:"param.licenseid"}})],1),a("el-form-item",{attrs:{label:"experience"}},[a("el-input",{attrs:{placeholder:"experience"},model:{value:e.param.experience,callback:function(a){e.$set(e.param,"experience",a)},expression:"param.experience"}})],1),a("el-form-item",{attrs:{label:"numDrones"}},[a("el-input",{attrs:{placeholder:"numDrones"},model:{value:e.param.numDrones,callback:function(a){e.$set(e.param,"numDrones",a)},expression:"param.numDrones"}})],1),a("el-form-item",{attrs:{label:"numLocations"}},[a("el-input",{attrs:{placeholder:"numLocations"},model:{value:e.param.numLocations,callback:function(a){e.$set(e.param,"numLocations",a)},expression:"param.numLocations"}})],1),a("el-form-item",[a("el-button",{attrs:{type:"primary"},on:{click:e.searchForm}},[e._v("Query")])],1)],1),a("el-table",{ref:"multipleTable",staticStyle:{width:"100%"},attrs:{border:"",data:e.tableList,"tooltip-effect":"dark"}},[a("el-table-column",{attrs:{align:"center",label:"username",prop:"username",sortable:""}}),a("el-table-column",{attrs:{align:"center",label:"licenseid",prop:"licenseid",sortable:""}}),a("el-table-column",{attrs:{align:"center",label:"experience",prop:"experience",sortable:""}}),a("el-table-column",{attrs:{align:"center",label:"numDrones",prop:"numDrones",sortable:""}}),a("el-table-column",{attrs:{align:"center",label:"numLocations",prop:"numLocations",sortable:""}})],1),a("el-pagination",{attrs:{background:"",layout:"prev, pager, next",total:e.total},on:{"current-change":e.changePage}})],1)},l=[],r={data(){return{param:{username:"",licenseid:"",experience:"",numDrones:"",numLocations:""},tableList:[],pageInfo:{pageNum:1,pageSize:10},total:0}},mounted(){this.getTableList(this.pageInfo)},methods:{getTableList(){this.$axios.post("/displayPilotView/findAll",Object.assign(this.param,this.pageInfo)).then(e=>{this.tableList=e.data.rows,this.total=e.data.count})},searchForm(){this.pageInfo.pageNum=1,this.getTableList()},changePage(e){this.pageInfo.pageNum=e,this.getTableList()}}},s=r,i=(t("1de6"),t("2877")),o=Object(i["a"])(s,n,l,!1,null,"df4d22e6",null);a["default"]=o.exports},f067:function(e,a,t){}}]);
//# sourceMappingURL=chunk-1fffacec.81ba1a04.js.map