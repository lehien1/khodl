import {AxiosRequestConfig} from "axios";

const axios: AxiosRequestConfig = {
    baseURL: 'http://localhost:8080',
    responseType: 'json',
    timeout: 30000,
    headers: {
        "Access-Control-Allow-Origin": "http://localhost:3000",
        'Access-Control-Allow-Methods': 'POST, PUT, PATCH, GET, DELETE, OPTIONS',
        "Access-Control-Allow-Headers": "*",
        'Content-Type': 'application/json',
        'Access-Control-Allow-Credentials': true
    }
}

export default {
    axios,
};