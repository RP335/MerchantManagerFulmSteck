import React, { useState } from 'react';
import Axios from 'axios';

function EnrollMerchantForm() {
    const [merchant, setMerchant] = useState({
      merchantName: '',
      merchantMobile: '',
      merchantEmail: '',
      merchantBusinessCategory: ''
    });
  
    const handleChange = event => {
      const { name, value } = event.target;
      setMerchant(prevMerchant => ({ ...prevMerchant, [name]: value }));
    };
  
    const handleSubmit = async event => {
      event.preventDefault();
      try {
        const response = await Axios.post('http://localhost:8080/api/merchants/enroll', merchant);
        console.log(response.data); // Log the response data
      } catch (error) {
        console.error('Error enrolling merchant:', error);
      }
    };
  
    return (
      <div>
        <h2>Enroll Merchant</h2>
        <form onSubmit={handleSubmit}>
        <input
          type="text"
          name="merchantName"
          value={merchant.merchantName}
          onChange={handleChange}
          placeholder="Merchant Name"
          required
        />
        <input
          type="text"
          name="merchantMobile"
          value={merchant.merchantMobile}
          onChange={handleChange}
          placeholder="Merchant Mobile"
          required
        />
        <input
          type="email"
          name="merchantEmail"
          value={merchant.merchantEmail}
          onChange={handleChange}
          placeholder="Merchant Email"
          required
        />
        <input
          type="text"
          name="merchantBusinessCategory"
          value={merchant.merchantBusinessCategory}
          onChange={handleChange}
          placeholder="Merchant Business Category"
          required
        />
        <button type="submit">Enroll</button>
      </form>
      </div>
    );
  }
  
  export default EnrollMerchantForm;
  