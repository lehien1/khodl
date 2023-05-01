import axios from 'axios';
import AppConfig from './AppConfig';

const client = axios.create(AppConfig.axios);

const ClientService = {
    get(url: string, config?: any) {
        return client.get(url, {...config});
    },

    post(url: string, params: any, config?: any) {
        return client.post(url, params, {...config});
    },

    put(url: string, params: any, config?: any) {
        return client.put(url, params, {...config});
    },

    delete(url: string, config?: any) {
        return client.delete(url, {...config});
    },
};

client.interceptors.response.use(res => {
    return res;
}, error => {
    if (error?.response?.status === 401) {
        localStorage.clear();
        window.location.pathname = '/';
    } else {
        throw error;
    }
})

export default ClientService;