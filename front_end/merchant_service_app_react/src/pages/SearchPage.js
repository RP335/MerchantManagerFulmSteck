import React, { useState } from 'react';
import axios from 'axios';
import SearchResultsTable from '../components/SearchResultsTable';

function SearchPage() {
    const [searchCriteria, setSearchCriteria] = useState({
        merchantId: '',
        merchantName: '',
        merchantEmail: '',
        merchantMobile: '',
        merchantBusinessCategory: ''
    });
    const [searchResults, setSearchResults] = useState([]);

    const handleSearch = async () => {
        try {
            const response = await axios.get('http://localhost:8080/api/merchants/search', {
                params: searchCriteria
            });
            setSearchResults(response.data);
        } catch (error) {
            console.error('Error searching merchants:', error);
        }
    };

    return (
        <div className="search-page">
            <h1>Search Page</h1>
            <div className="search-form">
                <div className="input-group">
                    <label>Merchant ID:</label>
                    <input
                        type="text"
                        value={searchCriteria.merchantId}
                        onChange={(e) => setSearchCriteria({ ...searchCriteria, merchantId: e.target.value })}
                    />
                </div>
                <div className="input-group">
                    <label>Merchant Name:</label>
                    <input
                        type="text"
                        value={searchCriteria.merchantName}
                        onChange={(e) => setSearchCriteria({ ...searchCriteria, merchantName: e.target.value })}
                    />
                </div>
                <div className="input-group">
                    <label>Merchant Email:</label>
                    <input
                        type="text"
                        value={searchCriteria.merchantEmail}
                        onChange={(e) => setSearchCriteria({ ...searchCriteria, merchantEmail: e.target.value })}
                    />
                </div>
                <div className="input-group">
                    <label>Merchant Mobile:</label>
                    <input
                        type="text"
                        value={searchCriteria.merchantMobile}
                        onChange={(e) => setSearchCriteria({ ...searchCriteria, merchantMobile: e.target.value })}
                    />
                </div>
                <div className="input-group">
                    <label>Merchant Business Category:</label>
                    <input
                        type="text"
                        value={searchCriteria.merchantBusinessCategory}
                        onChange={(e) => setSearchCriteria({ ...searchCriteria, merchantBusinessCategory: e.target.value })}
                    />
                </div>
            </div>
            <button onClick={handleSearch}>Search</button>
            <SearchResultsTable searchResults={searchResults}></SearchResultsTable>
        </div>
    );
}

export default SearchPage;
