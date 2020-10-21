import Vue from 'vue'
import App from './App.vue'
import axios from 'axios'
import { VuejsDatatableFactory } from 'vuejs-datatable';
 
Vue.use( VuejsDatatableFactory );
Vue.config.productionTip = false

new Vue({
  render: h => h(App),
}).$mount('#app')
