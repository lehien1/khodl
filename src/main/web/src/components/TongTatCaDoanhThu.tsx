import React, {useEffect, useState} from "react";
import API from "../api";

interface ListDoanhThuInterface {
    matHangKey: number;
    cuaHangKey: number;
    khachHangKey: number;
    thoiGianKey: number;
    tongSL: number;
    tongDT: number;
}

const TongTatCaDoanhThu = () => {
    const [listDisplay, setListDisplay] = useState<ListDoanhThuInterface>();
    useEffect(() => {
        getTongTatCaDoanhThu();
    }, []);

    const getTongTatCaDoanhThu = () => {
        API.getTongDoanhThu({
            nam: 2022
        }).then(resp => {
            setListDisplay(resp.data);
        })
    }

    return (
        <>
            <h2>Tổng tất cả doanh thu</h2>
            <table>
                <thead>
                <tr>
                    <th>Khách hàng key</th>
                    <th>Cửa hàng hàng key</th>
                    <th>Mặt hàng key</th>
                    <th>Thời gian key</th>
                    <th>Tổng số lượng</th>
                    <th>Tổng doanh thu</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>{listDisplay?.khachHangKey}</td>
                    <td>{listDisplay?.cuaHangKey}</td>
                    <td>{listDisplay?.matHangKey}</td>
                    <td>{listDisplay?.thoiGianKey}</td>
                    <td>{listDisplay?.tongSL}</td>
                    <td>{listDisplay?.tongDT?.toLocaleString()}</td>
                </tr>
                </tbody>
            </table>
        </>

    )
}

export default TongTatCaDoanhThu;