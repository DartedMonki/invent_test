<template>
  <div id="app">
    <!-- <NavBar />
    <div class="content">
      <Content /> 
    </div> -->
  <div id="vue-root">
    <datatable :columns="columns" :data="rows"></datatable>
  </div>
  </div>
</template>

<script>
import axios from 'axios'

export default {
  name: 'App',

  data: function(){
    return{
      produk: '',
      columns: [
          {label: 'id', field: 'id'},
          {label: 'Nama Barang', field: 'nama_barang', headerClass: 'class-in-header second-class'},
          {label: 'Kode Barang', field: 'kode_barang'},
          {label: 'Jumlah Barang', field: 'jumlah_barang'},
          {label: 'Tanggal', field: 'tanggal'}
      ],
      rows: '',
    };
  },
  mounted() {
    this.load()
  },
  methods: {
    load(){
        axios.get('http://localhost:8080/produk').then(res => {
        this.rows = res.data;
        console.log(this.rows);
      }).catch ((err) => {
        console.log(err);
      })
    }
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 0px;
}
/* body {
  width: 100%;
  height: 100%;
  margin: 0;
  padding: 0;
  font-family: "Segoe UI", Tahoma;
  background-image: url('./assets/bg-1.png');
  background-color: #eebece;
  background-size: 1366px 732px;
  background-position: left top;
  background-repeat: no-repeat;
  transition: 0.4s;
} */

</style>
