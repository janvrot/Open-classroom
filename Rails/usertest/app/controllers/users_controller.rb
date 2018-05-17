class UsersController < ApplicationController

	def index
		if @current_user.try(:role) != "admin"
			flash[:info] = "Accès interdit"
			return redirect_to request.referrer || "/users/home"
		end
		@users = User.all
	end

	def home

	end

	def login
	end

	def check
		@current_user = User.where(name: params[:name], password: params[:password]).first
		if @current_user
			session[:user_id] = @current_user.id
			flash[:info] = "Vous êtes maintenant connecté"
			redirect_to "/users/home"
		else
			session[:user_id] = nil
			flash[:info] = "Échec de la connexion"
			redirect_to "/users/login"
		end
	end

	def destroy
		session[:user_id] = nil
		flash[:info] = "Vous vous êtes déconnecté"
		redirect_to "/users/home"
	end
end