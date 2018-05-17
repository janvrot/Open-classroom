Rails.application.routes.draw do
	root 'users#home'

	get 'users' => 'users#index'
	get 'users/home' => 'users#home'
	get 'users/login' => 'users#login'
	get 'users/logout' => 'users#destroy'
	post 'users/login' => 'users#check'
end
