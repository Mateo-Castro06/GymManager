import axios from 'axios';

const axiosCLient = axios.create({
    baseUrl: "http://localhost:8080/api",
});
export default axiosCLient;