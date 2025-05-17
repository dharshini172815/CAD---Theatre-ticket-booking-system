package com.theatre;

import com.theatre.features.admin.AdminView;
import com.theatre.features.admin.dashboard.DashboardView;
import com.theatre.features.admin.movie.MovieView;
import com.theatre.features.admin.seat.SeatView;
import com.theatre.features.admin.showtime.ShowtimeView;
import com.theatre.features.auth.AuthenticateView;
import com.theatre.features.auth.login.LoginView;
import com.theatre.features.auth.register.RegisterView;
import com.theatre.features.booking.BookingView;
import com.theatre.features.booking.availability.AvailabilityView;
import com.theatre.features.booking.payment.PaymentView;
import com.theatre.features.booking.selection.SelectionView;
import com.theatre.features.booking.ticket.TicketView;
import com.theatre.features.browse.BrowseView;
import com.theatre.features.browse.filter.FilterView;
import com.theatre.features.browse.movies.MoviesView;
import com.theatre.features.history.HistoryView;

public class Main {
public static void main(String[] args) {
	new DashboardView().init();
	new MovieView().init();
	new SeatView().init();
	new ShowtimeView().init();
	new AdminView().init();
	new LoginView().init();
	new RegisterView().init();
	new AuthenticateView().init();
	new AvailabilityView().init();
	new PaymentView().init();
	new SelectionView().init();
	new TicketView().init();
	new BookingView().init();
	new FilterView().init();
	new MoviesView().init();
	new BrowseView().init();
	new HistoryView().init();
	}
}
