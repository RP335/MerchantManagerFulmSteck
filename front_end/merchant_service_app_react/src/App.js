// App.js
import React from 'react';
import { BrowserRouter as Router, Route, Routes} from 'react-router-dom';
import Navbar from './components/Navbar';
import HomePage from './pages/HomePage';
import DetailsPage from './pages/DetailsPage';
import SearchPage from './pages/SearchPage';
import EnrollPage from './pages/EnrollPage';
import AllMerchantsPage from './pages/AllMerchantsPage';
import './App.css'

function App() {
    return (
        <Router>
            <Navbar />
            <Routes>
                <Route path="/" exact element={<HomePage/>} />
                <Route path="/details" element={<DetailsPage/>} />
                <Route path="/search" element={<SearchPage/>} />
                <Route path="/enrollpage" element={<EnrollPage/>} />
                <Route path="/allmerchants" element={<AllMerchantsPage/>}/>
            </Routes>
        </Router>
    );
}

export default App;
