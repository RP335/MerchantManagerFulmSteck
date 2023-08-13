import React, { useEffect, useState } from 'react';
import Axios from 'axios';

function AllMerchantsPage() {
    const [merchants, setMerchants] = useState([]);

    useEffect(() => {
        // Fetch merchants from the API
        Axios.get('http://localhost:8080/api/merchants/all')
            .then(response => {
                setMerchants(response.data);
            })
            .catch(error => {
                console.error('Error fetching merchants:', error);
            });
    }, []);

    return (
        <div>
            <h1>All Merchants</h1>
            <table className='table table-bordered'>
                <thead>
                    <tr>
                        <th>Merchant ID</th>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Phone no.</th>
                        <th>Business Category</th>
                    </tr>
                </thead>
                <tbody>
                    {merchants.map(merchant => (
                        <tr key={merchant.merchantId}>
                            <td>{merchant.merchantId}</td>
                            <td>{merchant.merchantName}</td>
                            <td>{merchant.merchantEmail}</td>
                            <td>{merchant.merchantMobile}</td>
                            <td>{merchant.merchantBusinessCategory}</td>
                            {/* Add other columns as needed */}
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    );
}

export default AllMerchantsPage;
