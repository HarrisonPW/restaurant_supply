(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-01dbf39e"],{"2fd3":function(e,t,a){"use strict";a.r(t);a("14d9");var l=function(){var e=this,t=e._self._c;return t("el-card",{staticClass:"box-card"},[t("el-button",{attrs:{type:"primary"},on:{click:function(t){return e.$router.push("/admin/main/employee/add-pilot")}}},[e._v("Add Pilot")]),t("el-form",{staticClass:"demo-form-inline",attrs:{inline:!0}},[t("el-form-item",{attrs:{label:"id"}},[t("el-input",{attrs:{placeholder:"id"},model:{value:e.param.username,callback:function(t){e.$set(e.param,"username",t)},expression:"param.username"}})],1),t("el-form-item",{attrs:{label:"licenseid"}},[t("el-input",{attrs:{placeholder:"licenseid"},model:{value:e.param.licenseid,callback:function(t){e.$set(e.param,"licenseid",t)},expression:"param.licenseid"}})],1),t("el-form-item",{attrs:{label:"experience"}},[t("el-input",{attrs:{placeholder:"experience"},model:{value:e.param.experience,callback:function(t){e.$set(e.param,"experience",t)},expression:"param.experience"}})],1),t("el-form-item",[t("el-button",{attrs:{type:"primary"},on:{click:e.searchForm}},[e._v("Query")])],1)],1),t("el-table",{ref:"multipleTable",staticStyle:{width:"100%"},attrs:{border:"",data:e.tableList,"tooltip-effect":"dark"}},[t("el-table-column",{attrs:{align:"center",label:"username",prop:"username",sortable:""}}),t("el-table-column",{attrs:{align:"center",prop:"licenseid",label:"licenseid",sortable:""}}),t("el-table-column",{attrs:{align:"center",prop:"experience",label:"experience",sortable:""}}),t("el-table-column",{attrs:{align:"center",label:"operation"},scopedSlots:e._u([{key:"default",fn:function(a){return[t("el-button",{attrs:{type:"danger",size:"small"},on:{click:function(t){return e.handleDelete(a.row.username)}}},[e._v("Delete")])]}}])})],1),t("el-pagination",{attrs:{background:"",layout:"prev, pager, next",total:e.total},on:{"current-change":e.changePage}})],1)},s=[],n={data(){return{param:{username:"",licenseid:"",experience:""},tableList:[],pageInfo:{pageNum:1,pageSize:10},total:0}},mounted(){this.getTableList(this.pageInfo)},methods:{getTableList(){this.$axios.post("/pilots/findAll",Object.assign(this.param,this.pageInfo)).then(e=>{this.tableList=e.data.rows,this.total=e.data.count})},searchForm(){!this.param.licenseid||/^\d{6}$/.test(this.param.licenseid)?(this.pageInfo.pageNum=1,this.getTableList()):this.$message({message:"It needs to be 6 digits",type:"warning"})},changePage(e){this.pageInfo.pageNum=e,this.getTableList()},handleDelete(e){this.$confirm("Are you sure to delete this pilots?","Warning",{confirmButtonText:"OK",cancelButtonText:"Cancel",type:"warning"}).then(()=>{this.$axios.get("/pilots/remove/"+e).then(()=>{this.$message({type:"success",message:"Delete successfully!"}),this.getTableList()})}).catch(()=>{this.$message({type:"info",message:"Delete canceled"})})}}},i=n,r=(a("6645"),a("2877")),o=Object(r["a"])(i,l,s,!1,null,"2fcbc102",null);t["default"]=o.exports},"5cca":function(e,t,a){},6645:function(e,t,a){"use strict";a("5cca")}}]);
//# sourceMappingURL=chunk-01dbf39e.46b3931e.js.map