import API from './config';

export default {
    getTongDoanhThu(params: any) {
        return API.get('/api/tong-tat-ca-doanh-thu', {params: params});
    },

};