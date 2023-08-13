import React from 'react';
import { Link } from 'react-router-dom';

function Navbar() {
    return (
        <nav className="navbar navbar-expand-lg navbar-dark bg-dark shadow">
            <div className="container">
                <Link className="navbar-brand" to="/">Merchant Manager by ya boi RP</Link>
                <div className="collapse navbar-collapse">
                    <ul className="navbar-nav ml-auto">
                        <li className="nav-item"><Link className="nav-link" to="/">Home</Link></li>
                        <li className="nav-item"><Link className="nav-link" to="/details">Manage Merchants</Link></li>
                        <li className="nav-item"><Link className="nav-link" to="/search">Search</Link></li>
                        <li className="nav-item"><Link className="nav-link" to="/allmerchants">View All Merchants</Link></li>
                    </ul>
                </div>
            </div>
        </nav>
    );
}

export default Navbar;
